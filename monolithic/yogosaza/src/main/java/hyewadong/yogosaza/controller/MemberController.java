package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.MemberOutputDto;
import hyewadong.yogosaza.dto.MemberInputDto;
import hyewadong.yogosaza.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    // 회원 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerMember(@RequestBody MemberInputDto memberInputDto) throws SQLException {
        int result = memberService.registerMember(memberInputDto);
        return ResponseEntity.ok(result);
    }

    // 회원 상세 조회
    @GetMapping("")
    public ResponseEntity<?> getMember(@RequestParam int memberSeq) throws SQLException {
        MemberOutputDto result = memberService.getMember(memberSeq);
        return ResponseEntity.ok(result);
    }

    // 회원 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getMembers() throws SQLException {
        List<MemberOutputDto> result = memberService.getMembers();
        return ResponseEntity.ok(result);
    }

    // 회원 업데이트
    @PostMapping("/update")
    public ResponseEntity<?> updateMember(@RequestBody MemberInputDto memberInputDto) throws SQLException {
        int result = memberService.updateMember(memberInputDto);
        return ResponseEntity.ok(result);
    }

    // 회원 삭제
    @PostMapping("/delete")
    public ResponseEntity<?> deleteMember(@RequestBody MemberInputDto memberInputDto) throws SQLException {
        int result = memberService.deleteMember(memberInputDto);
        return ResponseEntity.ok(result);
    }




}