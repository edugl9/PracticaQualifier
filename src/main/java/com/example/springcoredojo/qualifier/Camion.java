package com.example.springcoredojo.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Camion implements Vehiculo{
    @Override
    public int contRuedas() {
        return 6;
    }
}
