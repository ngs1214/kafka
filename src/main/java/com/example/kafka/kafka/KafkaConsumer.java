package com.example.kafka.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {
    @KafkaListener(topics = "aa")
    public void testMessage(String msg) {
        System.out.println("msg = " + msg);
    }
}
