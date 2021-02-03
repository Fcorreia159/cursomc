package com.filipecorreia.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.filipecorreia.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
