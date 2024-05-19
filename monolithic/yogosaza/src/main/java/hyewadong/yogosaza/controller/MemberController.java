package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.dto.ApiResponse;
import hyewadong.yogosaza.dto.member.MemberLoginDto;
import hyewadong.yogosaza.dto.member.MemberOutputDto;
import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.dto.member.MemberRegisterDto;
import hyewadong.yogosaza.message.SuccessMessage;
import hyewadong.yogosaza.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    // 회원 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerMember(@Valid @RequestBody MemberRegisterDto memberRegisterDto) throws SQLException {
        int result = memberService.registerMember(memberRegisterDto);
        return ResponseEntity.ok(result);
    }

    // 회원 로그인
    @PostMapping("/login")
    public ResponseEntity<?> loginMember(@Valid @RequestBody MemberLoginDto memberLoginDto) throws SQLException {
        String jwt = memberService.loginMember(memberLoginDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + jwt);
        ApiResponse apiResponse = new ApiResponse(true, SuccessMessage.LOGIN.getMessage());
        return ResponseEntity.ok().headers(headers).body(apiResponse);
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
