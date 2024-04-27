package hyewadong.yogosaza.dto;


import lombok.Data;

@Data
public class MemberInputDto {

    private Integer memberSeq;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberPhone;
    private String memberAddress;

}
