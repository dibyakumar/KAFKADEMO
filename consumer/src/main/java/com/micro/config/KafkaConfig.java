package com.micro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

	
	@KafkaListener(topics=AppConstants.TOPIC_NAME,groupId=AppConstants.GROUP_ID)	
	public void updatedLocation(String value) {
		System.out.println(value);
	}
	
}