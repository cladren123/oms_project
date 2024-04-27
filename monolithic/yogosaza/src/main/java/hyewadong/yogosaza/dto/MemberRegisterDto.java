package hyewadong.yogosaza.dto;


import lombok.Data;

@Data
public class MemberRegisterDto {

    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberPhone;
    private String memberAddress;

}
