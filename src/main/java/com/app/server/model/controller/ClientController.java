package com.app.server.model.controller;


import com.app.server.model.entity.Client;
import com.app.server.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/users")
@CrossOrigin("*")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Client createUser(@RequestBody Client client){
        return clientService.createEntity(client);
    }
    @GetMapping()
    public List<Client> getAllUsers(){
        return clientService.getAllEntities();
    }
}
