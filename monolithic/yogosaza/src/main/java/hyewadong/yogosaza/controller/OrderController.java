package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.order.OrderInputDto;
import hyewadong.yogosaza.dto.order.OrderOutputDto;
import hyewadong.yogosaza.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    // 주문 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerOrder(@RequestBody OrderInputDto orderInputDto) throws SQLException {
        int result = orderService.registerOrder(orderInputDto);
        return ResponseEntity.ok(result);
    }

    // 주문 상세 조회
    @GetMapping("")
    public ResponseEntity<?> getOrder(@RequestParam int orderSeq) throws SQLException {
        OrderOutputDto result = orderService.getOrder(orderSeq);
        return ResponseEntity.ok(result);
    }

    // 회원 주문 조회
    @GetMapping("/member")
    public ResponseEntity<?> getOrdersByMemberSeq(@RequestParam int memberSeq) throws SQLException {
        List<OrderOutputDto> result = orderService.getOrdersByMemberSeq(memberSeq);
        return ResponseEntity.ok(result);
    }

    // 브랜드 주문 조회
    @GetMapping("/brand")
    public ResponseEntity<?> getOrdersByBrandSeq(@RequestParam int brandSeq) throws SQLException {
        List<OrderOutputDto> result = orderService.getOrdersByBrandSeq(brandSeq);
        return ResponseEntity.ok(result);
    }


    // 주문 수정
    @PostMapping("/update")
    public ResponseEntity<?> updateOrder(@RequestBody OrderInputDto OrderInputDto) throws SQLException {
        int result = orderService.updateOrder(OrderInputDto);
        return ResponseEntity.ok(result);
    }

    // 주문 취소
    @PostMapping("/cancel")
    public ResponseEntity<?> deleteOrder(@RequestBody OrderInputDto OrderInputDto) throws SQLException {
        int result = orderService.cancelOrder(OrderInputDto);
        return ResponseEntity.ok(result);
    }



}
