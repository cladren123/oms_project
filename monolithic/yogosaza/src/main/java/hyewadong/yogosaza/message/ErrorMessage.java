package hyewadong.yogosaza.message;

import lombok.Getter;

/**
 * 에러 메세지 관리
 */

@Getter
public enum ErrorMessage {

    SERVER_ERROR("서버 오류가 발생했습니다. 나중에 다시 시도해주세요."),
    ID_ALREADY_TAKEN("이미 등록된 아이디 입니다.");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

}
