package com.example.jsondemo;

import com.alibaba.fastjson.JSON;
import com.example.jsondemo.dto.City;
import com.example.jsondemo.dto.City1;
import com.example.jsondemo.dto.City2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JsonDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testJsonDemo() {
        String input = "{\"cityCode\":\"123456\"}";
        String output = "{\"outCode\":\"123456\"}";
        City city = JSON.parseObject(input, City.class);
        System.out.println("Parsed city:" + city);
        String result = JSON.toJSONString(city);
        assertEquals(output, result);
    }

    @Test
    void testJsonDemo1() {
        String input = "{\"cityCode\":\"123456\"}";
        String output = "{\"outCode\":\"123456\"}";
        City1 city = JSON.parseObject(input, City1.class);
        System.out.println("Parsed city:" + city);
        String result = JSON.toJSONString(city);
        assertEquals(output, result);
    }

    @Test
    void testJsonDemo2() {
        String input = "{\"cityCode\":\"123456\"}";
        String output = "{\"outCode\":\"123456\"}";
        City2 city = JSON.parseObject(input, City2.class);
        System.out.println("Parsed city:" + city);
        String result = JSON.toJSONString(city);
        assertEquals(output, result);
    }
}
