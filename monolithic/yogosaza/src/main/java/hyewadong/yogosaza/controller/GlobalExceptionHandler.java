package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.ApiResponse;
import hyewadong.yogosaza.exception.ConflictException;
import hyewadong.yogosaza.exception.InvalidCredentialsException;
import hyewadong.yogosaza.message.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

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
}
