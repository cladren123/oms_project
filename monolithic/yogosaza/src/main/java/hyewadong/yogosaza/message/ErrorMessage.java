package hyewadong.yogosaza.message;

import lombok.Getter;

/**
 * 에러 메세지 관리
 */

@Getter
public enum ErrorMessage {


    ID_ALREADY_TAKEN("이미 등록된 아이디 입니다.");


    private final String message;
    ErrorMessage(String message) {
        this.message = message;
    }

}
