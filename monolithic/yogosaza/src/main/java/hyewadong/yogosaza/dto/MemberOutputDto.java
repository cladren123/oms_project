package hyewadong.yogosaza.dto;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MemberOutputDto {

    private Integer MemberSeq;
    private String memberId;
    private String memberName;
    private String memberPhone;
    private String memberAddress;
    private LocalDateTime memberCreateDate;

}
