package com.sampleapp.message;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MessageApplication.class)
public class MessageControllerTest {

    @Autowired
    private MessageController controller;

    @Test
    public void itShouldSaveAndGet() {
        Message message = new Message();
        message.setMessage("Hello, world!");
        controller.createMessage("Hello, world!", "Larry");

        Iterable<Message> messages = controller.getMessages();
        assertThat(messages).hasSize(1);
        Message saved = messages.iterator().next();
        assertThat(saved.getMessage()).isEqualTo("Hello, world!");
    }
}