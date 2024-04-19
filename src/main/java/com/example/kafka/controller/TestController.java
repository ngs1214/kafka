package com.example.kafka.controller;

import com.example.kafka.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class TestController {
    private final KafkaProducer kafkaProducer;

    @GetMapping("/")
    public void test(){
        kafkaProducer.send("aa","1234");
    }



}
