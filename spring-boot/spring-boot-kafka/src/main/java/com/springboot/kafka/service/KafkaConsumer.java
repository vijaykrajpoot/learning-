package com.springboot.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.springboot.kafka.model.Message;

@Component
public class KafkaConsumer {
  private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

  @KafkaListener(topics = "messsage", groupId = "group_id")
  public void consume(Message message) {
    logger.info(String.format("#### -> Consumed message -> %s", message));
  }

}
