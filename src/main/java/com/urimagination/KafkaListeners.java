package com.urimagination;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(
            topics = "urimagination",
            groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + " 🎉 " + data);

    }
}
