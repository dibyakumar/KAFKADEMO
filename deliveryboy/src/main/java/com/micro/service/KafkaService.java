package com.micro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.micro.config.AppConstants;

@Service
public class KafkaService {

	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplet;
	
	public boolean updateLocation(String location) {
		this.kafkaTemplet.send(AppConstants.LOCATION_UPDATE_TOPIC, location);
		return true;
	}
}
