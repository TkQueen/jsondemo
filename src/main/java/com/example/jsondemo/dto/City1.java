package com.example.jsondemo.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 方案一
 * 但字段上使用JSONField 会导致解析不了输入的 cityCode
 */
@Data
public class City1 {
    @JSONField(name = "outCode")
    private String cityCode;
}
