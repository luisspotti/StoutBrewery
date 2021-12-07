package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Torra extends Maquina {

    public Torra(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
