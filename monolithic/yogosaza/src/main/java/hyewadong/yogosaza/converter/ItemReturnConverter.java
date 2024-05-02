package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.domain.ItemReturnDomain;
import hyewadong.yogosaza.dto.itemReturn.ItemReturnInputDto;
import lombok.Builder;
import lombok.Data;

import java.sql.BatchUpdateException;

public class ItemReturnConverter {

    public static ItemReturnDomain itemReturnInputDtoToItemReturnDomain(ItemReturnInputDto itemReturnInputDto) {
        return ItemReturnDomain.builder()
                .itemReturnSeq(itemReturnInputDto.getItemReturnSeq())
                .memberSeq(itemReturnInputDto.getMemberSeq())
                .orderSeq(itemReturnInputDto.getOrderSeq())
                .itemCode(itemReturnInputDto.getItemCode())
                .itemReturnQty(itemReturnInputDto.getItemReturnQty())
                .build();
    }

}
