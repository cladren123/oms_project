package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.stock.StockInputDto;
import hyewadong.yogosaza.dto.stock.StockOutputDto;
import hyewadong.yogosaza.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stock")
public class StockController {

    private final StockService stockService;


    // 재고 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerStock(@RequestBody StockInputDto stockInputDto) throws SQLException {
        int result = stockService.registerStock(stockInputDto);
        return ResponseEntity.ok(result);
    }

    // 재고 상세 조회
    @GetMapping("")
    public ResponseEntity<?> getStock(@RequestParam int stockSeq) throws SQLException {
        StockOutputDto result = stockService.getStock(stockSeq);
        return ResponseEntity.ok(result);
    }

    // 재고 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getStocks() throws SQLException {
        List<StockOutputDto> result = stockService.getStocks();
        return ResponseEntity.ok(result);
    }

    // 재고 수정
    @PostMapping("/update")
    public ResponseEntity<?> updateStock(@RequestBody StockInputDto stockInputDto) throws SQLException {
        int result = stockService.updateStock(stockInputDto);
        return ResponseEntity.ok(result);
    }




}
