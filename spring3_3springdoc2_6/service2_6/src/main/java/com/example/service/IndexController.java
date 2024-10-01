package com.example.service;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "IndexController", description = "test")
public class IndexController {

    @GetMapping("/hello")
    @Operation(summary = "hello world test")
    public String hello() {
        return "Hello World !";
    }
}
