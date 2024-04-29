package hyewadong.yogosaza.dto.stock;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockInputDto {

    private Integer stockSeq;
    private Integer itemSeq;
    private Integer stockQty;

}
