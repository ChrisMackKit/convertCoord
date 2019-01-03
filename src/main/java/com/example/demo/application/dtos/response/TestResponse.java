package com.example.demo.application.dtos.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("Test")
public class TestResponse {
    @ApiModelProperty(position = 1, required = true)
    int id;

    @ApiModelProperty(position = 2, required = true)
    String name;

    @ApiModelProperty(position = 3, required = true)
    String description;
}
