package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.MemberGetDto;
import hyewadong.yogosaza.dto.MemberRegisterDto;
import hyewadong.yogosaza.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/new")
    public ResponseEntity<?> registerMember(@RequestBody MemberRegisterDto memberRegisterDto) throws SQLException {
        int result = memberService.registerMember(memberRegisterDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("")
    public ResponseEntity<?> getMember(@RequestParam int memberSeq) throws SQLException {
        MemberGetDto result = memberService.getMember(memberSeq);
        return ResponseEntity.ok(result);
    }




}
