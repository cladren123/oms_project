package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.entity.MemberEntity;
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
    public ResponseEntity<?> registerMember(@RequestBody MemberEntity memberEntity) throws SQLException {
        int result = memberService.registerMember(memberEntity);
        return ResponseEntity.ok(result);
    }



}
