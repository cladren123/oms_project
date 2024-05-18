package hyewadong.yogosaza.dto.member;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

/**
 * 회원 로그인 폼
 */

@Data
@Builder
public class MemberLoginDto {

    @NotBlank(message = "아이디를 입력해 주세요.")
    private String memberId;

    @NotBlank(message = "비밀번호를 입력해 주세요.")
    private String memberPwd;

}
