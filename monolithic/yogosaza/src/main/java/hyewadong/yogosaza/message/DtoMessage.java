package hyewadong.yogosaza.message;

import lombok.Getter;

/**
 * DTO 유효성 검사 메세지
 *
 */
public enum DtoMessage {


    MEMBER_ID("아이디를 입력해 주세요."),
    MEMBER_PWD("비밀번호를 입력해 주세요."),
    MEMBER_NAME("이름을 입력해 주세요."),
    MEMBER_PHONE("전화번호를 입력해 주세요."),
    MEMBER_ADDRESS("주소를 입력해 주세요.");


    private final String message;

    DtoMessage(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }
}
