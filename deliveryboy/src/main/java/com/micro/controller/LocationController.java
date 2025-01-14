package com.micro.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.service.KafkaService;

@RestController
@RequestMapping("/deliveryBoy")
public class LocationController {

	private Logger logger = LoggerFactory.getLogger(KafkaService.class);
	
	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/updateLocation")
	public ResponseEntity<?> updateLocation(){
		this.kafkaService.updateLocation("( "+Math.round(Math.random()*100)+" )"+" , "+" ( "+Math.round(Math.random()*100)+" )");
		logger.info("message produced");
		return new ResponseEntity<>(Map.of("message","location updated"),HttpStatus.OK);
	}
	
	
}
