package com.bees.brewery;

public class Armazenamento {
    private float volume = 0;

    public float getVolume() {
        return volume;
    }

    public void addVolume(float val) {
        volume += val;
    }

    public void removeVolume(float val) {
        volume -= val;
        if (volume < 0)
            volume = 0;
    }


    /**
     * Temperatura do liquido, em Celsius.
     */
    protected float temperaturaDoLiquido;

    /**
     * Tempo de armazenamento do liquido, em segundos.
     */
    protected long tempoDeArmazenamento;
}
