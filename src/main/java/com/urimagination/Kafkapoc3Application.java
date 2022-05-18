package com.urimagination;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Kafkapoc3Application {

    public static void main(String[] args) {
        SpringApplication.run(Kafkapoc3Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            for (int i = 0; i < 93; i++) {
                kafkaTemplate.send("urimagination", "Hello UR Kafka 🥰 " + " " + i);
            }
        };
    }
}
