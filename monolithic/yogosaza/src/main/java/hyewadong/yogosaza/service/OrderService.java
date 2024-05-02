package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.OrderConverter;
import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.dto.order.OrderOutputDto;
import hyewadong.yogosaza.entity.OrderDomain;
import hyewadong.yogosaza.mapper.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    // 주문 등록
    public int registerOrder(OrderInputDto orderInputDto) throws SQLException {
        OrderDomain orderDomain = OrderConverter.orderInputDtoToOrderDomain(orderInputDto);
        orderDomain.orderRegister();
        return orderRepository.registerOrder(orderDomain);
    }

    // 주문 상세 조회
    public OrderOutputDto getOrder(int orderSeq) throws SQLException {
        return orderRepository.getOrder(orderSeq);
    }

    // 회원 주문 조회
    public List<OrderOutputDto> getOrdersByMemberSeq(int memberSeq) throws SQLException {
        return orderRepository.getOrdersByMemberSeq(memberSeq);
    }

    // 브랜드 주문 조회
    public List<OrderOutputDto> getOrdersByBrandSeq(int brandSeq) throws SQLException {
        return orderRepository.getOrdersByBrandSeq(brandSeq);
    }

    // 주문 수정
    public int updateOrder(OrderInputDto orderInputDto) throws SQLException {
        return orderRepository.updateOrder(orderInputDto);
    }

    // 주문 취소
    public int cancelOrder(OrderInputDto orderInputDto) throws SQLException {
        OrderDomain orderDomain = OrderConverter.orderInputDtoToOrderDomain(orderInputDto);
        orderDomain.orderCancel();
        return orderRepository.cancelOrder(orderDomain);
    }

}
