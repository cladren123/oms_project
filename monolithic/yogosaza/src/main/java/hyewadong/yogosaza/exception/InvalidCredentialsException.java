package hyewadong.yogosaza.exception;


/**
 * 잘못된 자격 증명 예외
 */
public class InvalidCredentialsException extends RuntimeException{
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
