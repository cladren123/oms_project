package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.dto.item.ItemInputDto;
import hyewadong.yogosaza.dto.item.ItemOutputDto;
import hyewadong.yogosaza.entity.ItemEntity;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface ItemMapper {

    // 상품 등록
    public int registerItem(ItemEntity itemEntity) throws SQLException;

    // 상품 조회
    public ItemOutputDto getItem(int itemSeq) throws SQLException;

    // 상품 전체 조회
    public List<ItemOutputDto> getItems() throws SQLException;

    // 상품 수정
    public int updateItem(ItemInputDto itemInputDto) throws SQLException;

    // 상품 삭제
    public int deleteItem(int itemSeq) throws SQLException;


}
