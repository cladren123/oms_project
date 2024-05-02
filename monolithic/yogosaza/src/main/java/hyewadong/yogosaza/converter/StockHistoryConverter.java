package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.domain.StockHistoryDomain;
import hyewadong.yogosaza.dto.stockHistory.StockHistoryInputDto;

public class StockHistoryConverter {

    public static StockHistoryDomain stockHistoryInputDtoToStockHistoryDomain(StockHistoryInputDto stockHistoryInputDto) {
        return StockHistoryDomain.builder()
                .stockHistorySeq(stockHistoryInputDto.getStockHistorySeq())
                .itemSeq(stockHistoryInputDto.getItemSeq())
                .stockHistoryChangeQty(stockHistoryInputDto.getStockHistoryChangeQty())
                .build();
    }
}
