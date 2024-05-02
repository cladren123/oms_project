package hyewadong.yogosaza.domain;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MemberDomain {

    private Integer memberSeq;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberPhone;
    private String memberAddress;
    private LocalDateTime memberCreateDate;

}
