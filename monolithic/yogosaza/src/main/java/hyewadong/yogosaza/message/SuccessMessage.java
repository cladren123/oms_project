package hyewadong.yogosaza.message;


import lombok.Getter;

/**
 * 성공 메세지 구현
 */

@Getter
public enum SuccessMessage {

    LOGIN("로그인이 성공적으로 완료되었습니다.");


    private final String message;

    SuccessMessage(String message) {
        this.message = message;
    }

}
