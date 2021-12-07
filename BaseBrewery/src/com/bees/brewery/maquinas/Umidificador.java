package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Umidificador extends Maquina {

    public Umidificador(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
