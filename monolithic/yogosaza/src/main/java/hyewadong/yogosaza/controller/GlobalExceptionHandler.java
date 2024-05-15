package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.ApiResponse;
import hyewadong.yogosaza.exception.ConflictException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// 예외 처리

@ControllerAdvice
public class GlobalExceptionHandler {

    // DTO 유효성 검사 에러 처리
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse> handleValidationException(MethodArgumentNotValidException ex) {
        List<String> errorMessages = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        ApiResponse apiResponse = new ApiResponse(false, errorMessages);
        return ResponseEntity.badRequest().body(apiResponse);
    }

    // 중복 충돌 에러 처리
    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<ApiResponse> handleConflictException(ConflictException ex) {
        List<String> message = new ArrayList<>();
        message.add(ex.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse(false, message));
    }





}
