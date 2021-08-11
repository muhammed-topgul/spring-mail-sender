package com.muhammedtopgul.springmailsender;

/*
 * created by Muhammed Topgul
 * on 06/07/2021
 * at 16:37
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MailService mailService;

    @GetMapping
    public void sendMail() {
        mailService.sendMail();
    }
}
