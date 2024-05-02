package hyewadong.yogosaza.dto.pay;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class PayInputDto {

    private Integer paySeq;
    private Integer orderSeq;
    private String payType;
    private String payCardNo;
    private Integer payPrice;

}
