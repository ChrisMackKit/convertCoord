package com.example.demo.application.controllers.Api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/test")
@Api(tags = "test", description = "This is only a test route")
public interface TestApi {
    @GetMapping
    @ApiOperation(value = "Finds all tests")
    Object[] getTests();
}
