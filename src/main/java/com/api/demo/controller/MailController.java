package com.api.demo.controller;

import com.api.demo.MailSender.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailSender mailSender;

    @RequestMapping("/mail")
     public String mail() {
        mailSender.send("raulpaes@gmail.com", "Video de Formatura", "Oi Raul, segue o e-mail.");

        return "Mail sent";
     }

}
