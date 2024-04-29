package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.dto.item.ItemOutputDto;
import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.entity.ItemEntity;
import hyewadong.yogosaza.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.w3c.dom.stylesheets.LinkStyle;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface OrderMapper {

    // 주문 등록
    public int registerOrder(OrderEntity orderEntity) throws SQLException;

    // 주문 상세 조회
    public ItemOutputDto getOrder(int itemSeq) throws SQLException;

    // 회원 주문 조회
    public List<ItemOutputDto> getOrdersByMemberSeq(int memberSeq) throws SQLException;

    // 판매자 주문 조회
    public List<ItemOutputDto> getOrdersBySellerSeq(int sellerSeq) throws SQLException;

    // 주문 수정
    public int updateOrder(OrderInputDto orderInputDto) throws SQLException;

    // 주문 취소
    public int cancelOrder(OrderInputDto orderInputDto) throws SQLException;



}
