package com.projectname.backend.test;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "테스트", description = "테스트 API")
public class TestController {
    @GetMapping("/test")
    @Operation(summary = "테스트임", description = "ㅎㅇ 출력")
    public String test() {
        return "ㅎㅇ";
    }
}
