package com.poliza.seguro.repository;


import com.poliza.seguro.model.Poliza;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolizaRepository extends MongoRepository<Poliza, String> {
}
