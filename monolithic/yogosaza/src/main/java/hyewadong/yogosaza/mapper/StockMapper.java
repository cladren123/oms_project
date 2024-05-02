package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.dto.stock.StockInputDto;
import hyewadong.yogosaza.domain.StockDomain;

public class StockMapper {

    public static StockDomain stockInputDtoToStockDomain(StockInputDto stockInputDto) {
        return StockDomain.builder()
                .stockSeq(stockInputDto.getStockSeq())
                .itemSeq(stockInputDto.getItemSeq())
                .stockQty(stockInputDto.getStockQty())
                .build();
    }

}
