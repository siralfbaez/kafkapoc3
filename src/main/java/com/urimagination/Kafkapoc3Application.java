package com.urimagination;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class Kafkapoc3Application {

    public static void main(String[] args) {
        SpringApplication.run(Kafkapoc3Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> kafkaTemplate){
        return args -> {
            for (int i = 0; i < 93; i++) {
                kafkaTemplate.send("urimagination",
                        new Message("Hello UR Kafka 🥰 " + " " + i, LocalDateTime.now()));
            }
        };
    }
}
