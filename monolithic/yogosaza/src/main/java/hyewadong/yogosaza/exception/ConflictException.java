package hyewadong.yogosaza.exception;

// 중독 처리 예외
public class ConflictException extends RuntimeException {
    public ConflictException(String message) {
        super(message);
    }
}
