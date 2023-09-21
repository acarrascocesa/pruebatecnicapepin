package com.poliza.seguro.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.poliza.seguro.model.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
