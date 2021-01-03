package com.api.demo.controller;

import MailSender.MailSender;
import MailSender.MockMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender = new MockMailSender();
    @RequestMapping("/mail")
     public String mail() {
        mailSender.send("raulpaes@gmail.com", "Video de Formatura", "Oi Raul, segue o e-mail.");

        return "Mail sent";
     }

}
