package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.stock.StockInputDto;
import hyewadong.yogosaza.entity.StockDomain;

public class StockConverter {

    public static StockDomain stockInputDtoToStockDomain(StockInputDto stockInputDto) {
        return StockDomain.builder()
                .stockSeq(stockInputDto.getStockSeq())
                .itemSeq(stockInputDto.getItemSeq())
                .stockQty(stockInputDto.getStockQty())
                .build();
    }

}
