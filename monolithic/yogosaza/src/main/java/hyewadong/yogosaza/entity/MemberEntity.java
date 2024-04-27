package hyewadong.yogosaza.entity;


import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class MemberEntity {

    private int memberSeq;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberPhone;
    private String memberAddress;
    private LocalDateTime memberCreateDate;

}
