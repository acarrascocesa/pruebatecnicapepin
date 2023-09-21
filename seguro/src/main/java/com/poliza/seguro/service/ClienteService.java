package com.poliza.seguro.service;


import com.poliza.seguro.model.Cliente;
import com.poliza.seguro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Guardar un Cliente
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Obtener todos los Clientes
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    // Obtener un Cliente por ID
    public Cliente findById(String id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
