package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Envasadora extends Maquina {

    public Envasadora(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
