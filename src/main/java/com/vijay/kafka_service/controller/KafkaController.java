package com.vijay.kafka_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class KafkaController {
    final private KafkaTemplate template;
    public KafkaController(KafkaTemplate template) {
        this.template = template;
    }
    @PostMapping("/send")
    public ResponseEntity<String> sendMQ(@RequestParam("message") String message) {
        int entry = 0;
        template.send("twitter", message);

        return new ResponseEntity<>("message sent to kafka server", HttpStatus.OK);
    }
}
