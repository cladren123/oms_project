package simolfire.studyProject.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simolfire.studyProject.service.BrandService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/brand")
@Slf4j
public class BrandController {

    private final BrandService brandService;

}
