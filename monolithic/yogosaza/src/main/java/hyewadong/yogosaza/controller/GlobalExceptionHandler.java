package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;


// 예외 처리

@ControllerAdvice
public class GlobalExceptionHandler {

    // DTO 유효성 검사 에러 처리
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationException(MethodArgumentNotValidException ex) {
        List<String> errorMessages = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        ApiResponse apiResponse = new ApiResponse(false, errorMessages);
        return ResponseEntity.badRequest().body(apiResponse);
    }


}
