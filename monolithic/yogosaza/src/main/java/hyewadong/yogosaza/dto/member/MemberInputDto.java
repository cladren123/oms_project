package hyewadong.yogosaza.dto.member;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 회원 입력 폼
 */
@Data
public class MemberInputDto {

    private Integer memberSeq;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberPhone;
    private String memberAddress;

}
