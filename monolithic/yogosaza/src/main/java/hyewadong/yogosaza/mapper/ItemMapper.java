package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.dto.item.ItemInputDto;
import hyewadong.yogosaza.domain.ItemDomain;

public class ItemMapper {

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
