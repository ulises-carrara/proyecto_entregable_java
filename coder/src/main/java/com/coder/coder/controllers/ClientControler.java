package com.coder.coder.controllers;


import com.coder.coder.entities.Client;
import com.coder.coder.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/clients")
public class ClientControler {
    @Autowired
    private ClientService service;

    @PostMapping()//ES UN DECORADOR QUE SE UTILIZA PARA HCER SOLICITUDES DE TIPO POST
    public void saveClient(@RequestBody Client client){//REQUESTBODY ES PARA VINCULAR EL OBJETO QUE ENVIA LA SOLICITUD CON LA VARIABLE client
        try {

            service.saveClient(client);

        }catch (Exception e){
            System.out.println(e);
            throw new RuntimeException("ERROR AL CREAR");
        }

    }
    @GetMapping()
    public List<Client> readClients(){
        try {
            return service.readClients();
        }catch (Exception e){
            System.out.println(e);
            throw new RuntimeException("ERROR AL LEER");
        }

    }

    @GetMapping("/{id}")
    public Optional<Client> readOne (@PathVariable("id") Integer id){
        try {
            return service.readOne(id);
        }catch (Exception e){
            System.out.println(e);
            throw new RuntimeException("ERROR AL LEER");
        }
    }

    @DeleteMapping("/{id}")
    public void destroyOneClient (@PathVariable("id") Integer id){
        try {
            service.destroyOneClient(id);
        }catch (Exception e){
            System.out.println(e);
            throw new RuntimeException("ERROR AL BORRAR");
        }
    }
}
