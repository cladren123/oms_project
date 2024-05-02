package hyewadong.yogosaza.dto.stockHistory;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class StockHistoryOutputDto {

    private Integer stockHistorySeq;
    private Integer itemSeq;
    private Integer stockHistoryChangeQty;
    private LocalDateTime stockHistoryCreateDate;

}
