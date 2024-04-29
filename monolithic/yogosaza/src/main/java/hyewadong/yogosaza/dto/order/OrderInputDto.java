package hyewadong.yogosaza.dto.order;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderInputDto {

    private Integer orderSeq;
    private Integer memberSeq;
    private Integer itemSeq;
    private String orderAddress;
    private Integer orderQty;
    private String orderStatus;

}
