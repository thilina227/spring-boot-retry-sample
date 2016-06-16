package com.example.service;

import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * Created by Thilina on 6/16/16.
 */
@Service
public class MyService {

    @Retryable(value = {Exception.class}, maxAttempts = 5)
    public void myRetryableMethod() throws Exception {
        System.out.println("executing method");
        throw new Exception("test");
    }
}
