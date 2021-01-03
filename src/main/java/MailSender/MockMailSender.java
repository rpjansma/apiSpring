package MailSender;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MockMailSender implements MailSender{

    private static Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending MOCK mail to " + to);
        log.info("with subject " + subject);
        log.info("and body " + body);

    }
}
