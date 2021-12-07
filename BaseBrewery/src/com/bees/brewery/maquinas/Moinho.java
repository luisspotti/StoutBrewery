package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Moinho extends Maquina {

    public Moinho(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
