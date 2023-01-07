package com.example.unittestdemo.controller;

import com.example.unittestdemo.service.DemoService;
import com.example.unittestdemo.util.RequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class DemoController {

    @Autowired
    DemoService demoService;

    public String execute(String request) {
        if (!RequestValidator.valid(request)) {
            return "";
        }
        try {
            return demoService.getResult(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String request) {

        String key = convertToKey(request);
        demoService.deleteByKey(key);
    }

    private String convertToKey(String request) {
        return request.trim();
    }
}