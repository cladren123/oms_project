package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.entity.ItemEntity;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface ItemMapper {

    // 상품 등록
    public int registerItem(ItemEntity itemEntity) throws SQLException;





}
