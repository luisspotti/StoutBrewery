package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Refrigeradora extends Maquina {

    public Refrigeradora(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
