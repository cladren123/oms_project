package hyewadong.yogosaza.service;

import hyewadong.yogosaza.converter.ItemConverter;
import hyewadong.yogosaza.dto.item.ItemInputDto;
import hyewadong.yogosaza.dto.item.ItemOutputDto;
import hyewadong.yogosaza.domain.ItemDomain;
import hyewadong.yogosaza.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemService {

    private final ItemRepository itemRepository;

    // 상품 등록
    public int registerItem(ItemInputDto itemInputDto) throws SQLException {
        ItemDomain itemDomain = ItemConverter.itemInputDtoToItemDomain(itemInputDto);
        itemDomain.makeDate();
        return itemRepository.registerItem(itemDomain);
    }

    // 상품 조회
    public ItemOutputDto getItem(int itemSeq) throws SQLException {
        return itemRepository.getItem(itemSeq);
    }

    // 상품 전체 조회
    public List<ItemOutputDto> getItems() throws SQLException {
        return itemRepository.getItems();
    }

    // 상품 수정
    public int updateItem(ItemInputDto itemInputDto) throws SQLException {
        return itemRepository.updateItem(itemInputDto);
    }

    // 상품 삭제
    public int deleteItem(ItemInputDto itemInputDto) throws SQLException {
        return itemRepository.deleteItem(itemInputDto.getItemSeq());
    }





}
