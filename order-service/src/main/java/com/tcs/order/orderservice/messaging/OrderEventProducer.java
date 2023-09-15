package com.tcs.order.orderservice.messaging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class OrderEventProducer {
	@Autowired
    private KafkaTemplate<K, V> kafkaTemplate;
    @Autowired
    private Queue queue;

    public void send(String message) {
    	@Value("${topic.name.producer}")
        private String topicName;

        private final KafkaTemplate<String, String> kafkaTemplate;

        public void send(String message){
            log.info("Payload enviado: {}", message);
            kafkaTemplate.send(topicName, message);
        }

    }
}
