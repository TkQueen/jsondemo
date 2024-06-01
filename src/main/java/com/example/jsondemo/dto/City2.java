package com.example.jsondemo.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 方案二
 * 仅对get方法增加注解可以实现需求，但字段越多越繁琐，不清楚有没有更优解
 */
@Data
public class City2 {
    private String cityCode;

    @JSONField(name = "outCode")
    public String getCityCode() {
        return cityCode;
    }
}
