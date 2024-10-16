package com.app.server.service.Impl;

import com.app.server.model.entity.Client;
import com.app.server.repository.ClientRepository;
import com.app.server.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl extends BasicServiceImpl<Client> implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        super(clientRepository);
        this.clientRepository = clientRepository;
    }
}
