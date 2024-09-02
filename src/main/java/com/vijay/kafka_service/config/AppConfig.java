package com.vijay.kafka_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.common.internals.Topic;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class AppConfig {
    @Bean
    public NewTopic topic(){
        return new NewTopic("twitter",1, (short) 1);
    }
//    @Bean
//    public KafkaTemplate<String,String> kafkaTemplate() {
//        ProducerFactory<String, String> producerFactory=new DefaultKafkaProducerFactory<>();
//        return new KafkaTemplate<>(producerFactory);
//    }
}
