package com.sampleapp.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageRepository repo;

    @RequestMapping("/message")
    @CrossOrigin
    Iterable<Message> home() {
        return repo.findAll();
    }

}