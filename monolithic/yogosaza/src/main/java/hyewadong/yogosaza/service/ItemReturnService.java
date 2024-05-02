package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.ItemReturnConverter;
import hyewadong.yogosaza.domain.ItemReturnDomain;
import hyewadong.yogosaza.dto.itemReturn.ItemReturnInputDto;
import hyewadong.yogosaza.dto.itemReturn.ItemReturnOutputDto;
import hyewadong.yogosaza.mapper.ItemReturnMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemReturnService {

    private final ItemReturnMapper itemReturnMapper;

    // 반품 등록
    public int registerItemReturn(ItemReturnInputDto itemReturnInputDto) throws SQLException {
        ItemReturnDomain itemReturnDomain = ItemReturnConverter.itemReturnInputDtoToItemReturnDomain(itemReturnInputDto);
        itemReturnDomain.makeDate();
        return itemReturnMapper.registerItemReturn(itemReturnDomain);
    }

    // 반품 상세 조회
    public ItemReturnOutputDto getItemReturn(int itemReturnSeq) throws SQLException {
        return itemReturnMapper.getItemReturn(itemReturnSeq);
    }

    // 전체 반품 조회
    public List<ItemReturnOutputDto> getItemReturns() throws SQLException {
        return itemReturnMapper.getItemReturns();
    }

    // 회원별 반품 조회
    public List<ItemReturnOutputDto> getItemReturnsByMemberSeq(int memberSeq) throws SQLException {
        return itemReturnMapper.getItemReturnsByMemberSeq(memberSeq);
    }

    // 반품 수정
    public int updateItemReturn(ItemReturnInputDto itemReturnInputDto) throws SQLException {
        ItemReturnDomain itemReturnDomain = ItemReturnConverter.itemReturnInputDtoToItemReturnDomain(itemReturnInputDto);
        itemReturnDomain.makeDate();
        return itemReturnMapper.updateItemReturn(itemReturnDomain);
    }

    // 주문 취소
    public int deleteItemReturn(ItemReturnInputDto itemReturnInputDto) throws SQLException {
        return itemReturnMapper.deleteItemReturn(itemReturnInputDto);
    }



}
