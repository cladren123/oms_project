package hyewadong.yogosaza.entity;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockEntity {

    private Integer stockSeq;
    private Integer itemSeq;
    private Integer stockQty;

}
