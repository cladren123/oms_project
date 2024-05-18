package hyewadong.yogosaza.controller;


import hyewadong.yogosaza.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * 개발에 필요한 기능 컨트롤러
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {


    private final TestService testService;

    @GetMapping("/test-error")
    public String testError() {
        throw new RuntimeException("Test Exception");
    }

    @PostMapping("/dummy/member")
    public ResponseEntity<?> makeDummyMember() throws SQLException {
        testService.makeDummyMember();
        return ResponseEntity.ok("ok");
    }

}
