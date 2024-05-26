package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.dto.item.ItemListDto;
import hyewadong.yogosaza.dto.item.ItemInputDto;
import hyewadong.yogosaza.dto.item.ItemOutputDto;
import hyewadong.yogosaza.domain.ItemDomain;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface ItemMapper {

    // 상품 등록
    public int registerItem(ItemDomain itemDomain) throws SQLException;

    // 상품 조회
    public ItemOutputDto getItem(int itemSeq) throws SQLException;

    // 상품 전체 조회
    public List<ItemOutputDto> getItems() throws SQLException;

    // 상품 수정
    public int updateItem(ItemInputDto itemInputDto) throws SQLException;

    // 상품 삭제
    public int deleteItem(int itemSeq) throws SQLException;


    // 상품 전체 개수 조회
    public int countItem() throws SQLException;

    // 상품들 조회 최신순
    public List<ItemListDto> getItemsByLatest(int startOffset, int endOffset) throws SQLException;

    // 상품들 조회 낮은 금액순
    public List<ItemListDto> getItemsByLowPrice(int start, int end) throws SQLException;

    // 상품들 조회 높은 금액순
    public List<ItemListDto> getItemsByHighPrice(int start, int end) throws SQLException;

}
