package hyewadong.yogosaza.dto.pay;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class PayOutputDto {

    private Integer paySeq;
    private Integer orderSeq;
    private String payType;
    private String payCardNo;
    private Integer payPrice;
    private LocalDateTime payCreateDate;


}
