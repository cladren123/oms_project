package hyewadong.yogosaza.domain;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class StockHistoryDomain {

    private Integer stockHistorySeq;
    private Integer itemSeq;
    private Integer stockHistoryChangeQty;
    private LocalDateTime stockHistoryCreateDate;

    public void makeDate() {
        stockHistoryCreateDate = LocalDateTime.now();
    }

}
