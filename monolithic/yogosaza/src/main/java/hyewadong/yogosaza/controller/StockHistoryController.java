package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.stock.StockInputDto;
import hyewadong.yogosaza.dto.stock.StockOutputDto;
import hyewadong.yogosaza.dto.stockHistory.StockHistoryInputDto;
import hyewadong.yogosaza.dto.stockHistory.StockHistoryOutputDto;
import hyewadong.yogosaza.service.StockHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stockHistory")
public class StockHistoryController {

    private final StockHistoryService stockHistoryService;

    // 재고 내역 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerStockHistory(@RequestBody StockHistoryInputDto stockHistoryInputDto) throws SQLException {
        int result = stockHistoryService.registerStockHistory(stockHistoryInputDto);
        return ResponseEntity.ok(result);
    }

    // 재고 내역 조회
    @GetMapping("")
    public ResponseEntity<?> getStockHistory(@RequestParam int stockHistorySeq) throws SQLException {
        StockHistoryOutputDto result = stockHistoryService.getStockHistory(stockHistorySeq);
        return ResponseEntity.ok(result);
    }

    // 재고 내역 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getStockHistories() throws SQLException {
        List<StockHistoryOutputDto> result = stockHistoryService.getStockHistories();
        return ResponseEntity.ok(result);
    }

    // 상품별 재고 내역 전체 조회
    @GetMapping("/item")
    public ResponseEntity<?> getStockHistories(@RequestParam int itemSeq) throws SQLException {
        List<StockHistoryOutputDto> result = stockHistoryService.getStockHistoriesByItemSeq(itemSeq);
        return ResponseEntity.ok(result);
    }

    // 재고 내역 수정
    @PostMapping("/update")
    public ResponseEntity<?> updateStockHistory(@RequestBody StockHistoryInputDto stockHistoryInputDto) throws SQLException {
        int result = stockHistoryService.updateStockHistory(stockHistoryInputDto);
        return ResponseEntity.ok(result);
    }

    // 재고 내역 삭제
    @PostMapping("/delete")
    public ResponseEntity<?> deleteStockHistory(@RequestBody StockHistoryInputDto stockHistoryInputDto) throws SQLException {
        int result = stockHistoryService.deleteStockHistory(stockHistoryInputDto);
        return ResponseEntity.ok(result);
    }


    // 재고 수정 시 재고 내역 저장(프로시저 사용)
    @PostMapping("/newProcedure")
    public ResponseEntity<?> updateStockFromStockHistory(@RequestBody StockHistoryInputDto stockHistoryInputDto) throws SQLException {
        stockHistoryService.updateStockFromStockHistory(stockHistoryInputDto);
        return ResponseEntity.ok("ok");
    }

}
