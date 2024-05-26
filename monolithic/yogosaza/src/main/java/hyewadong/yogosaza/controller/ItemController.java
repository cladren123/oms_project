package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.Page;
import hyewadong.yogosaza.dto.item.ItemInputDto;
import hyewadong.yogosaza.dto.item.ItemListDto;
import hyewadong.yogosaza.dto.item.ItemOutputDto;
import hyewadong.yogosaza.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    // 상품 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerItem(@RequestBody ItemInputDto itemInputDto) throws SQLException {
        int result = itemService.registerItem(itemInputDto);
        return ResponseEntity.ok(result);
    }

    // 상품 상세 조회
    @GetMapping("")
    public ResponseEntity<?> getItem(@RequestParam int itemSeq) throws SQLException {
        ItemOutputDto result = itemService.getItem(itemSeq);
        return ResponseEntity.ok(result);
    }

    // 상품 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getItems() throws SQLException {
        List<ItemOutputDto> result = itemService.getItems();
        return ResponseEntity.ok(result);
    }

    // 상품 업데이트
    @PostMapping("/update")
    public ResponseEntity<?> updateItem(@RequestBody ItemInputDto itemInputDto) throws SQLException {
        int result = itemService.updateItem(itemInputDto);
        return ResponseEntity.ok(result);
    }

    // 상품 삭제
    @PostMapping("/delete")
    public ResponseEntity<?> deleteItem(@RequestBody ItemInputDto itemInputDto) throws SQLException {
        int result = itemService.deleteItem(itemInputDto);
        return ResponseEntity.ok(result);
    }

    // 상품 리스트 조회 최신순
    @GetMapping("/list/latest")
    public ResponseEntity<?> getItemsByLatest(@RequestParam Integer offset) throws SQLException {
        List<ItemListDto> result = itemService.getItemsByLatest(offset);
        return ResponseEntity.ok(result);
    }

    // 상품들 조회 최신순 페이지
    @GetMapping("/page/latest")
    public ResponseEntity<?> getItemPageByLatest(@RequestParam(required = true) int page) throws SQLException {
        Page<ItemListDto> result = itemService.getItemPageByLatest(page);
        return ResponseEntity.ok(result);
    }

    // 상품들 조회 낮은 금액순 페이지
    @GetMapping("/page/lowPrice")
    public ResponseEntity<?> getItemsPageByLowPrice(@RequestParam(required = true) int page) throws SQLException {
        Page<ItemListDto> result = itemService.getItemPageByLowPrice(page);
        return ResponseEntity.ok(result);
    }

}
