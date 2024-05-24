package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.ApiResponse;
import hyewadong.yogosaza.exception.ConflictException;
import hyewadong.yogosaza.exception.InvalidCredentialsException;
import hyewadong.yogosaza.exception.PageOutOfRangeException;
import hyewadong.yogosaza.message.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// 예외 처리

@ControllerAdvice
public class GlobalExceptionHandler {

    // 서버 에러 처리
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ApiResponse> handleAllExceptions(Exception ex, WebRequest request) {
//        ApiResponse apiResponse = new ApiResponse(false, ErrorMessage.SERVER_ERROR.getMessage());
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiResponse);
//    }

    // 타입 에러 처리
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ApiResponse> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        String requiredType = ex.getRequiredType().getSimpleName(); // 필요한 데이터 타입
        String value = ex.getValue() == null ? "null" : ex.getValue().toString(); // 입력된 값
        String errorMessage = String.format("잘못된 파라미터 입력: %s는(은) %s 타입이어야 합니다. 입력된 값: %s", ex.getName(), requiredType, value);

        ApiResponse apiResponse = new ApiResponse(false, errorMessage);
        return ResponseEntity.badRequest().body(apiResponse);
    }


    // DTO 유효성 검사 에러 처리
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse> handleValidationException(MethodArgumentNotValidException ex) {
        List<String> errorMessages = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        String errorMessage = String.join(" ", errorMessages);
        ApiResponse apiResponse = new ApiResponse(false, errorMessage);
        return ResponseEntity.badRequest().body(apiResponse);
    }

    // 중복 충돌 에러 처리
    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<ApiResponse> handleConflictException(ConflictException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse(false, ex.getMessage()));
    }

    // 유효하지 않은 인증 처리
    @ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<ApiResponse> handleInvalidCredentials(InvalidCredentialsException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse(false, ex.getMessage()));
    }

    // 유효 페이지 범위 벗어난 예외 처리
    @ExceptionHandler(PageOutOfRangeException.class)
    public ResponseEntity<ApiResponse> handlePageOutOfRange(PageOutOfRangeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(false, ex.getMessage()));
    }
}
