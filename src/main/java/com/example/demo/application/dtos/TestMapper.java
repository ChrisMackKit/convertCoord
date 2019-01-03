package com.example.demo.application.dtos;

import com.example.demo.application.dtos.response.TestResponse;
import com.example.demo.application.dtos.service.TestDto;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TestMapper {
    TestResponse toResponse(TestDto testDto);
    List<TestResponse> toResponseList(List<TestDto> testDtos);
}
