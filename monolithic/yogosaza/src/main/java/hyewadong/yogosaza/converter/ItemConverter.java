package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.item.ItemInputDto;
import hyewadong.yogosaza.entity.ItemDomain;

public class ItemConverter {

    public static ItemDomain itemInputDtoToItemDomain(ItemInputDto itemInputDto) {
        return ItemDomain.builder()
                .itemSeq(itemInputDto.getItemSeq())
                .brandSeq(itemInputDto.getBrandSeq())
                .categoryId(itemInputDto.getCategoryId())
                .itemCode(itemInputDto.getItemCode())
                .itemName(itemInputDto.getItemName())
                .itemPrice(itemInputDto.getItemPrice())
                .itemColor(itemInputDto.getItemColor())
                .itemSize(itemInputDto.getItemSize())
                .build();
    }

}
