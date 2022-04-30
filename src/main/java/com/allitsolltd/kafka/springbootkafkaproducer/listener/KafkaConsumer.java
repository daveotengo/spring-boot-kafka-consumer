package com.allitsolltd.kafka.springbootkafkaproducer.listener;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.allitsolltd.kafka.springbootkafkaproducer.model.User;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example_jsons", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
