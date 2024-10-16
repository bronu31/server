package com.app.server.service.Impl;

import com.app.server.model.entity.Client;
import com.app.server.repository.ClientRepository;
import com.app.server.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImplAbstract extends AbstractBasicServiceImpl<Client> implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImplAbstract(ClientRepository clientRepository) {
        super(clientRepository);
        this.clientRepository = clientRepository;
    }
}
