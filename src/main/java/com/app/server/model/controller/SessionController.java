package com.app.server.model.controller;


import com.app.server.service.ClientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/session")
@CrossOrigin
public class SessionController {

    private ClientService clientService;

    public SessionController(ClientService clientService) {
        this.clientService = clientService;
    }
}
