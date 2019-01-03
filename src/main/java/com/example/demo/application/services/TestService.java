package com.example.demo.application.services;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public Object[] findAll() {
        Object[] tests = {"Test1", "Test2"};
        return tests;
    }
}
