package com.spring.cortana.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.cortana.models.EmailRequest;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Commit by arnab
@RestController//To specify this class as a Rest type controller
@RequestMapping("/rest")
public class GenericRestController {	
	
	@Value("${spring.mail.host}")
	String HOST;
	@Value("${spring.mail.port}")
	int PORT;
	@PostMapping("/sendEmail.spr")
	public ResponseEntity<String> sendEmailAPI(@RequestBody EmailRequest erq) {

		SimpleMailMessage message = new SimpleMailMessage();
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		try {
			message.setFrom(erq.getFrom());
			message.setTo(erq.getTo());
			message.setSubject(erq.getSubject());
			message.setText(erq.getMessage());
			message.setCc(erq.getCc());
			message.setBcc(erq.getBcc());

			System.out.println(message);
			
			Properties properties = mailSender.getJavaMailProperties();
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.ssl.trust", "*");
			properties.put("mail.transport.protocol", "smtp");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.debug", "true");
			mailSender.setHost(HOST);
			mailSender.setPort(PORT);
			mailSender.setUsername(erq.getFrom());
			mailSender.setPassword(erq.getPassword());
			mailSender.setJavaMailProperties(properties);
			
			mailSender.send(message);
			
			System.out.println(mailSender.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error in Sending Email");
		}

		return new ResponseEntity<String>("Mail Sent Successfully",HttpStatus.OK);
	}

}
