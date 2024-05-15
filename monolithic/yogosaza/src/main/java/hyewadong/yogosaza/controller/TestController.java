package hyewadong.yogosaza.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 개발에 필요한 기능 컨트롤러
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test-error")
    public String testError() {
        throw new RuntimeException("Test Exception");
    }


}
