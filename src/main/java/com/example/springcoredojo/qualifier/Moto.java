package com.example.springcoredojo.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Moto implements Vehiculo{

    @Override
    public int contRuedas() {
        return 2;
    }
}
