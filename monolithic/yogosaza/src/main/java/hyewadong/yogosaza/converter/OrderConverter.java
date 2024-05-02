package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.entity.OrderDomain;

public class OrderConverter {

    public static OrderDomain orderInputDtoToOrderEntity(OrderInputDto orderInputDto) {
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
