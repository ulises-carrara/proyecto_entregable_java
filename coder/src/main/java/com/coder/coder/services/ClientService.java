package com.coder.coder.services;

import com.coder.coder.entities.Client;
import com.coder.coder.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public void saveClient(Client client){
        repository.save(client);
    }

    public List<Client> readClients (){
       return repository.findAll();
    }

    public Optional<Client> readOne (Integer id){
        return repository.findById(id);
    }

    public void destroyOneClient(Integer id){
        repository.deleteById(id);
    }


}
