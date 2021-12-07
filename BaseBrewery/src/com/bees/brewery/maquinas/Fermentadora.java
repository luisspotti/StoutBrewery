package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Fermentadora extends Maquina {

    public Fermentadora(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
