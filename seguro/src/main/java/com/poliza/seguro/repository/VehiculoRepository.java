package com.poliza.seguro.repository;


import com.poliza.seguro.model.Vehiculo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends MongoRepository<Vehiculo, String> {
}
