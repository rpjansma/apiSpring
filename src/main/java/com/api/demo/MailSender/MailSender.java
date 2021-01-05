package com.api.demo.MailSender;

public interface MailSender {

    void send(String to, String subject, String body);
}
