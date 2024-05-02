package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.itemReturn.ItemReturnInputDto;
import hyewadong.yogosaza.dto.itemReturn.ItemReturnOutputDto;
import hyewadong.yogosaza.service.ItemReturnService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/itemReturn")
public class ItemReturnController {

    private final ItemReturnService itemReturnService;


    // 반품 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerItemReturn(@RequestBody ItemReturnInputDto itemReturnInputDto) throws SQLException {
        int result = itemReturnService.registerItemReturn(itemReturnInputDto);
        return ResponseEntity.ok(result);
    }

    // 반품 상세 조회
    @GetMapping("")
    public ResponseEntity<?> getItemReturn(@RequestParam int itemReturnSeq) throws SQLException {
        ItemReturnOutputDto result = itemReturnService.getItemReturn(itemReturnSeq);
        return ResponseEntity.ok(result);
    }

    // 반품 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getItemReturn() throws SQLException {
        List<ItemReturnOutputDto> result = itemReturnService.getItemReturns();
        return ResponseEntity.ok(result);
    }

    // 회원별 반품 조회
    @GetMapping("/member")
    public ResponseEntity<?> getItemReturnsByMemberSeq(@RequestParam int memberSeq) throws SQLException {
        List<ItemReturnOutputDto> result = itemReturnService.getItemReturnsByMemberSeq(memberSeq);
        return ResponseEntity.ok(result);
    }

    // 반품 수정
    @PostMapping("/update")
    public ResponseEntity<?> updateItemReturn(@RequestBody ItemReturnInputDto itemReturnInputDto) throws SQLException {
        int result = itemReturnService.updateItemReturn(itemReturnInputDto);
        return ResponseEntity.ok(result);
    }

    // 상품 삭제
    @PostMapping("/delete")
    public ResponseEntity<?> deleteItemReturn(@RequestBody ItemReturnInputDto itemReturnInputDto) throws SQLException {
        int result = itemReturnService.deleteItemReturn(itemReturnInputDto);
        return ResponseEntity.ok(result);
    }


}
