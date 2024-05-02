package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.domain.ItemReturnDomain;
import hyewadong.yogosaza.domain.OrderDomain;
import hyewadong.yogosaza.dto.itemReturn.ItemReturnInputDto;
import hyewadong.yogosaza.dto.itemReturn.ItemReturnOutputDto;
import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.dto.order.OrderOutputDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface ItemReturnMapper {

    // 반품 등록
    public int registerItemReturn(ItemReturnDomain itemReturnDomain) throws SQLException;

    // 반품 상세 조회
    public ItemReturnOutputDto getItemReturn(int itemReturnSeq) throws SQLException;

    // 전체 반품 조회
    public List<ItemReturnOutputDto> getItemReturns() throws SQLException;

    // 회원별 반품 조회
    public List<ItemReturnOutputDto> getItemReturnsByMemberSeq(int memberSeq) throws SQLException;

    // 반품 수정
    public int updateItemReturn(ItemReturnDomain itemReturnDomain) throws SQLException;

    // 주문 취소
    public int deleteItemReturn(ItemReturnInputDto itemReturnInputDto) throws SQLException;


}
