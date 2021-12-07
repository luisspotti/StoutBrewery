package com.bees.brewery.ex;

public class VolumeInsuficienteEx extends  Exception{
    @Override
    public String getMessage() {
        return "Volume de entrada insuficiente";
    }
}
