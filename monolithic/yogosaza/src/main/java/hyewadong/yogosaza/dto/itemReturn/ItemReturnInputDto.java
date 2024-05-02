package hyewadong.yogosaza.dto.itemReturn;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ItemReturnInputDto {

    private Integer itemReturnSeq;
    private Integer memberSeq;
    private Integer orderSeq;
    private String itemCode;
    private Integer itemReturnQty;


}
