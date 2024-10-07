package com.app.server.service.Impl;

import com.app.server.model.entity.Client;
import com.app.server.repository.UserRepository;
import com.app.server.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {

    private UserRepository userRepository;

    public ClientServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Client> getAllEntities() {
        return userRepository.findAll();
    }

    @Override
    public Client getEntityById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteEntity(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public Client saveEntity(Client entity) {
        return userRepository.save(entity);
    }

    @Override
    public Client createEntity(Client entity) {
        return saveEntity(entity);
    }
}
