package com.example.springcoredojo.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class VehiculoService {
    @Autowired
    @Qualifier("moto")
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
