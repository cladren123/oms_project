package hyewadong.yogosaza.entity;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class MemberEntity {

    private Integer memberSeq;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberPhone;
    private String memberAddress;
    private LocalDateTime memberCreateDate;

}
