package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.entity.OrderEntity;

public class OrderConverter {

    public static OrderEntity orderInputDtoToOrderEntity(OrderInputDto orderInputDto) {
        return OrderEntity.builder()
                .orderSeq(orderInputDto.getOrderSeq())
                .memberSeq(orderInputDto.getMemberSeq())
                .itemSeq(orderInputDto.getItemSeq())
                .orderAddress(orderInputDto.getOrderAddress())
                .orderQty(orderInputDto.getOrderQty())
                .orderStatus(orderInputDto.getOrderStatus())
                .build();
    }

}
