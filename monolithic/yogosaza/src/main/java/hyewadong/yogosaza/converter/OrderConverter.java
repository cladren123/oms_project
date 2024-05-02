package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.domain.OrderDomain;

public class OrderConverter {

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
