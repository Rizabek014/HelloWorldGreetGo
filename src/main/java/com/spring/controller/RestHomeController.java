package com.spring.controller;

import com.spring.message.Response;
import com.spring.dao.MessageMapper;
import com.spring.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestHomeController {
    private MessageMapper messageMapper;


    public RestHomeController(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @GetMapping(value = "/getMessage")
    public Response getResource() {
        Response response = new Response("Done", messageMapper.findById(1L).getMessage());
        return response;
    }
}
