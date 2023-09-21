package com.poliza.seguro.controller;


import com.poliza.seguro.model.Vehiculo;
import com.poliza.seguro.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    // Crear un vehículo
    @PostMapping
    public ResponseEntity<Vehiculo> createVehiculo(@RequestBody Vehiculo vehiculo) {
        try {
            Vehiculo newVehiculo = vehiculoService.createVehiculo(vehiculo);
            return new ResponseEntity<>(newVehiculo, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Obtener todos los vehículos
    @GetMapping
    public ResponseEntity<List<Vehiculo>> getAllVehiculos() {
        try {
            List<Vehiculo> vehiculos = vehiculoService.getAllVehiculos();
            return new ResponseEntity<>(vehiculos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Obtener un vehículo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> getVehiculoById(@PathVariable String id) {
        try {
            Vehiculo vehiculo = vehiculoService.getVehiculoById(id);
            if (vehiculo != null) {
                return new ResponseEntity<>(vehiculo, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Actualizar un vehículo
    @PutMapping("/{id}")
    public ResponseEntity<Vehiculo> updateVehiculo(@PathVariable String id, @RequestBody Vehiculo vehiculo) {
        try {
            Vehiculo updatedVehiculo = vehiculoService.updateVehiculo(id, vehiculo);
            if (updatedVehiculo != null) {
                return new ResponseEntity<>(updatedVehiculo, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Eliminar un vehículo
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteVehiculo(@PathVariable String id) {
        try {
            vehiculoService.deleteVehiculo(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

