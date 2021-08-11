package com.muhammedtopgul.springmailsender;

/*
 * created by Muhammed Topgul
 * on 06/07/2021
 * at 16:38
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("exampleFrom@mail.com");
        message.setTo("exampleTo@mail.com");
        message.setSubject("Topic");
        message.setText("Message Content");
        emailSender.send(message);
    }
}
