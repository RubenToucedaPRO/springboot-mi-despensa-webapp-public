package com.midespensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.midespensa.dtos.ProductDTO;
import com.midespensa.exceptions.EmailSendException;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

/**
 * Servicio encargado de manejar la logica de envio de correos electrónicos
 */
@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
	@Value("${server.url.mail}")
	private String baseUrl;

	private final JavaMailSender mailSender;
	private final TemplateEngine templateEngine;
	@Override
	public void sendEmailFrom(String from, String subject, String body) {

		// TODO: lógica oculta en versión pública
		
	}
	
	@Override
	public void sendMailHtmlValidMail(String to, String token) {

		// TODO: lógica oculta en versión pública
			
	}
	
	@Override
	public void sendMailHtmlResetPass(String to, String token) {

		// TODO: lógica oculta en versión pública
		
	}
	
	@Override
	public void sendMailHtmlShoppingList(String to, List<ProductDTO> productDtoList) {

		// TODO: lógica oculta en versión pública
		
	}

	

}
