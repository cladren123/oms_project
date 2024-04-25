package study.MemberLogic.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.MemberLogic.entity.MemberEntity;
import study.MemberLogic.service.MemberService;

import java.sql.SQLException;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {


    @Autowired
    MemberService memberService;

    // 등록
    @PostMapping("")
    public ResponseEntity<?> registerMember(@RequestBody MemberEntity memberEntity) throws SQLException {
        int number = memberService.registerMember(memberEntity);
        return ResponseEntity.ok(number);
    }

    // 조회
    @GetMapping("")
    public ResponseEntity<?> getMember(@RequestParam int seq) throws SQLException {
        return ResponseEntity.ok(memberService.getMember(seq));
    }

    // 전체 조회
    @GetMapping("members")
    public ResponseEntity<?> getMembers() throws SQLException {
        return ResponseEntity.ok(memberService.getMembers());
    }


    // 수정
    @PutMapping("")
    public ResponseEntity<?> modifyMember(@RequestBody MemberEntity memberEntity) throws SQLException {
        return ResponseEntity.ok(memberService.modifyMember(memberEntity));
    }

    // 삭제
    @DeleteMapping("")
    public ResponseEntity<?> removeMember(@RequestParam int seq) throws SQLException {
        return ResponseEntity.ok(memberService.removeMember(seq));
    }


}
