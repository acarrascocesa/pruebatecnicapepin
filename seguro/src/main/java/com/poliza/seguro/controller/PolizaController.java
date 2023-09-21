package com.poliza.seguro.controller;


import com.poliza.seguro.model.Poliza;
import com.poliza.seguro.model.Vehiculo;
import com.poliza.seguro.service.PolizaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/polizas")
public class PolizaController {

    @Autowired
    private PolizaService polizaService;

    // Crear una póliza
    @PostMapping
    public ResponseEntity<Poliza> createPoliza(@RequestBody Poliza poliza) {
        try {
            Poliza newPoliza = polizaService.createPoliza(poliza);
            return new ResponseEntity<>(newPoliza, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Obtener todas las pólizas
    @GetMapping
    public ResponseEntity<List<Poliza>> getAllPolizas() {
        try {
            List<Poliza> polizas = polizaService.getAllPolizas();
            return new ResponseEntity<>(polizas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Obtener una póliza por ID
    @GetMapping("/{id}")
    public ResponseEntity<Poliza> getPolizaById(@PathVariable String id) {
        try {
            Poliza poliza = polizaService.getPolizaById(id);
            if (poliza != null) {
                return new ResponseEntity<>(poliza, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Actualizar una póliza
    @PutMapping("/{id}")
    public ResponseEntity<Poliza> updatePoliza(@PathVariable String id, @RequestBody Poliza poliza) {
        try {
            Poliza updatedPoliza = polizaService.updatePoliza(id, poliza);
            if (updatedPoliza != null) {
                return new ResponseEntity<>(updatedPoliza, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Eliminar una póliza
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deletePoliza(@PathVariable String id) {
        try {
            polizaService.deletePoliza(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Añadir vehículos a una póliza
    @PutMapping("/{id}/vehiculos")
    public ResponseEntity<Poliza> addVehiculosToPoliza(@PathVariable String id, @RequestBody List<Vehiculo> vehiculos) {
        try {
            Poliza updatedPoliza = polizaService.addVehiculosToPoliza(id, vehiculos);
            if (updatedPoliza != null) {
                return new ResponseEntity<>(updatedPoliza, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
