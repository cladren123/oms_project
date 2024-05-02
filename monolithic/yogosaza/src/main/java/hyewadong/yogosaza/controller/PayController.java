package hyewadong.yogosaza.controller;

import hyewadong.yogosaza.dto.pay.PayInputDto;
import hyewadong.yogosaza.dto.pay.PayOutputDto;
import hyewadong.yogosaza.dto.stock.StockInputDto;
import hyewadong.yogosaza.dto.stock.StockOutputDto;
import hyewadong.yogosaza.service.PayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pay")
public class PayController {

    private final PayService payService;

    // 결제 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerPay(@RequestBody PayInputDto payInputDto) throws SQLException {
        int result = payService.registerPay(payInputDto);
        return ResponseEntity.ok(result);
    }

    // 결제 상세 조회
    @GetMapping("")
    public ResponseEntity<?> getPay(@RequestParam int paySeq) throws SQLException {
        PayOutputDto result = payService.getPay(paySeq);
        return ResponseEntity.ok(result);
    }

    // 결제 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getPays() throws SQLException {
        List<PayOutputDto> result = payService.getPays();
        return ResponseEntity.ok(result);
    }

    // 결제 수정
    @PostMapping("/update")
    public ResponseEntity<?> updatePay(@RequestBody PayInputDto payInputDto) throws SQLException {
        int result = payService.updatePay(payInputDto);
        return ResponseEntity.ok(result);
    }



}
