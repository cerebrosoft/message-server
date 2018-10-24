package com.sampleapp.message;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MessageController {

    @Autowired
    private MessageRepository repo;

    @GetMapping("/message")
    @CrossOrigin
    public Iterable<Message> getMessages() {
        return repo.findAll(new Sort(Direction.DESC, "date"));
    }
    
    @PostMapping("/message")
    public Message createMessage(@RequestParam("message") String text, @RequestParam("name") String name) {
        Message message = new Message();
        message.setMessage(text);
        message.setName(name);
        message.setDate(new Date());
        return repo.save(message);
    }

}