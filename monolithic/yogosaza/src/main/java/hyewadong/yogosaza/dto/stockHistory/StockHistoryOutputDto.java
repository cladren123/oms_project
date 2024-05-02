package hyewadong.yogosaza.dto.stockHistory;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockHistoryOutputDto {

    private Integer stockHistorySeq;
    private Integer itemSeq;
    private Integer stockHistoryChangeQty;
    private Integer stockHistoryCreateDate;

}
