package com.micro.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
	
	// adding a topic 
	@Bean
	public NewTopic topic() {
		// we can partitions also 
		return TopicBuilder.name(AppConstants.LOCATION_UPDATE_TOPIC).build();
	}
}
