package com.poliza.seguro.service;

import com.poliza.seguro.model.Poliza;
import com.poliza.seguro.model.Vehiculo;
import com.poliza.seguro.repository.PolizaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolizaService {

    @Autowired
    private PolizaRepository polizaRepository;

    // Crear una póliza
    public Poliza createPoliza(Poliza poliza) {
        return polizaRepository.save(poliza);
    }

    // Obtener todas las pólizas
    public List<Poliza> getAllPolizas() {
        return polizaRepository.findAll();
    }

    // Obtener una póliza por ID
    public Poliza getPolizaById(String id) {
        return polizaRepository.findById(id).orElse(null);
    }

    // Actualizar una póliza
    public Poliza updatePoliza(String id, Poliza polizaDetails) {
        Poliza poliza = getPolizaById(id);
        if (poliza != null) {
            // Actualiza los campos que necesites, por ejemplo:
            poliza.setCliente(polizaDetails.getCliente());
            // ... (otros campos)
            return polizaRepository.save(poliza);
        }
        return null;
    }

    // Eliminar una póliza
    public void deletePoliza(String id) {
        polizaRepository.deleteById(id);
    }

    // Añadir vehículos a una póliza
    public Poliza addVehiculosToPoliza(String id, List<Vehiculo> vehiculos) {
        Poliza poliza = getPolizaById(id);
        if (poliza != null) {
            poliza.getVehiculos().addAll(vehiculos);
            return polizaRepository.save(poliza);
        }
        return null;
    }
}
