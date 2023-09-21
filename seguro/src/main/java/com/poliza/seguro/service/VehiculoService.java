package com.poliza.seguro.service;


import com.poliza.seguro.model.Vehiculo;
import com.poliza.seguro.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    // Crear un vehículo
    public Vehiculo createVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    // Obtener todos los vehículos
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    // Obtener un vehículo por ID
    public Vehiculo getVehiculoById(String id) {
        return vehiculoRepository.findById(id).orElse(null);
    }

    // Actualizar un vehículo
    public Vehiculo updateVehiculo(String id, Vehiculo vehiculoDetails) {
        Vehiculo vehiculo = getVehiculoById(id);
        if (vehiculo != null) {
            // Actualiza los campos que necesites, por ejemplo:
            vehiculo.setMarca(vehiculoDetails.getMarca());
            // ... (otros campos)
            return vehiculoRepository.save(vehiculo);
        }
        return null;
    }

    // Eliminar un vehículo
    public void deleteVehiculo(String id) {
        vehiculoRepository.deleteById(id);
    }
}

