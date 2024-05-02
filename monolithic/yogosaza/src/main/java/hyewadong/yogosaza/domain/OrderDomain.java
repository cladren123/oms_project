package hyewadong.yogosaza.domain;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderDomain {

    private Integer orderSeq;
    private Integer memberSeq;
    private Integer itemSeq;
    private String orderAddress;
    private Integer orderQty;
    private String orderStatus;
    private LocalDateTime orderCreateDate;
    private LocalDateTime orderCancelDate;

    // 주문 등록 메소드
    public void orderRegister() {
        orderStatus = "주문중";
        orderCreateDate = LocalDateTime.now();
    }

    // 주문 취소 메소드
    public void orderCancel() {
        orderStatus = "주문취소";
        orderCancelDate = LocalDateTime.now();
    }

}
