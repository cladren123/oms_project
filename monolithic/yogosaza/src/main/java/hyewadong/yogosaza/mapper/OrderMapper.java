package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.entity.OrderDomain;

public class OrderMapper {

    public static OrderDomain orderInputDtoToOrderDomain(OrderInputDto orderInputDto) {
        return OrderDomain.builder()
                .orderSeq(orderInputDto.getOrderSeq())
                .memberSeq(orderInputDto.getMemberSeq())
                .itemSeq(orderInputDto.getItemSeq())
                .orderAddress(orderInputDto.getOrderAddress())
                .orderQty(orderInputDto.getOrderQty())
                .orderStatus(orderInputDto.getOrderStatus())
                .build();
    }

}
