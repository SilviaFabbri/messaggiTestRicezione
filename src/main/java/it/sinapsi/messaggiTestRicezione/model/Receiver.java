package it.sinapsi.messaggiTestRicezione.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.sinapsi.messaggiTestRicezione.Dao.EmailDao;
import jakarta.jms.JMSException;
import jakarta.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private EmailDao emailDao;
    @JmsListener(destination = "email", containerFactory = "myFactory")
    public void receiveMessage(TextMessage textMessage) throws JsonProcessingException, JMSException {
        Email email = objectMapper.readValue(textMessage.getText(), Email.class);
        emailDao.createPostgres(email);
    }
}