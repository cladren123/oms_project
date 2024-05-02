package hyewadong.yogosaza.domain;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockHistoryDomain {

    private Integer stockHistorySeq;
    private Integer itemSeq;
    private Integer stockHistoryChangeQty;
    private Integer stockHistoryCreateDate;

}
