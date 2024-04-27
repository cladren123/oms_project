package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.dto.member.MemberOutputDto;
import hyewadong.yogosaza.dto.seller.SellerInputDto;
import hyewadong.yogosaza.dto.seller.SellerOutputDto;
import hyewadong.yogosaza.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/seller")
public class SellerController {

    private final SellerService sellerService;

    // 판매자 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerSeller(@RequestBody SellerInputDto sellerInputDto) throws SQLException {
        int result = sellerService.registerSeller(sellerInputDto);
        return ResponseEntity.ok(result);
    }

    // 판매자 상세 조회
    @GetMapping("")
    public ResponseEntity<?> getSeller(@RequestParam int sellerSeq) throws SQLException {
        SellerOutputDto result = sellerService.getSeller(sellerSeq);
        return ResponseEntity.ok(result);
    }

    // 판매자 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getSellers() throws SQLException {
        List<SellerOutputDto> result = sellerService.getSellers();
        return ResponseEntity.ok(result);
    }

    // 판매자 업데이트
    @PostMapping("/update")
    public ResponseEntity<?> updateSeller(@RequestBody SellerInputDto sellerInputDto) throws SQLException {
        int result = sellerService.updateSeller(sellerInputDto);
        return ResponseEntity.ok(result);
    }

    // 판매자 삭제
    @PostMapping("/delete")
    public ResponseEntity<?> deleteSeller(@RequestBody SellerInputDto sellerInputDto) throws SQLException {
        int result = sellerService.deleteSeller(sellerInputDto);
        return ResponseEntity.ok(result);
    }

}
