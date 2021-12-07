package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Secadora extends Maquina {

    public Secadora(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
