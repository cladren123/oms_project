package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.dto.order.OrderOutputDto;
import hyewadong.yogosaza.entity.OrderDomain;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface OrderRepository {

    // 주문 등록
    public int registerOrder(OrderDomain orderDomain) throws SQLException;

    // 주문 상세 조회
    public OrderOutputDto getOrder(int orderSeq) throws SQLException;

    // 회원 주문 조회
    public List<OrderOutputDto> getOrdersByMemberSeq(int memberSeq) throws SQLException;

    // 브랜드 주문 조회
    public List<OrderOutputDto> getOrdersByBrandSeq(int brandSeq) throws SQLException;

    // 주문 수정
    public int updateOrder(OrderInputDto orderInputDto) throws SQLException;

    // 주문 취소
    public int cancelOrder(OrderDomain orderDomain) throws SQLException;



}
