package simolfire.studyProject.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import simolfire.studyProject.service.TestService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
@Slf4j
public class TestController {

    private final TestService testService;
    
    @GetMapping("registerDummyBrand")
    public ResponseEntity<?> registerDummyBrand() {
        testService.registerDummyBrand();
        return ResponseEntity.ok("ok");
    }

    @GetMapping("registerDummyUser")
    public ResponseEntity<?> registerDummyUser() {
        testService.registerDummyUser();
        return ResponseEntity.ok("ok");
    }

    @GetMapping("registerDummyProduct")
    public ResponseEntity<?> registerDummyProduct() {
        testService.registerDummyProduct();
        return ResponseEntity.ok("ok");
    }

    @GetMapping("registerDummyOrder")
    public ResponseEntity<?> registerDummyOrder() {
        testService.registerDummyOrder();
        return ResponseEntity.ok("ok");
    }


}
