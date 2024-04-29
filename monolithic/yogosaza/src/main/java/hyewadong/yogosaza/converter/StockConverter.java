package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.stock.StockInputDto;
import hyewadong.yogosaza.entity.StockEntity;

public class StockConverter {

    public static StockEntity stockInputDtoToStockEntity(StockInputDto stockInputDto) {
        return StockEntity.builder()
                .stockSeq(stockInputDto.getStockSeq())
                .itemSeq(stockInputDto.getItemSeq())
                .stockQty(stockInputDto.getStockQty())
                .build();
    }

}
