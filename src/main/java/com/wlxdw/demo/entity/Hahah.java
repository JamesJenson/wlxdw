package com.wlxdw.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "测试类")
public class Hahah {
    @ApiModelProperty(value = "yuzx")
    private String name;
}
