package hyewadong.yogosaza.dto.member;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MemberRegisterDto {

    @NotBlank(message = "아이디를 입력해 주세요.")
    private String memberId;

    @NotBlank(message = "비밀번호를 입력해 주세요.")
    private String memberPwd;

    @NotBlank(message = "이름을 입력해 주세요.")
    private String memberName;

    @NotBlank(message = "전화번호를 입력해 주세요.")
    private String memberPhone;

    @NotBlank(message = "주소를 입력해 주세요.")
    private String memberAddress;


}
