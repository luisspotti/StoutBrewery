package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Maturadora extends Maquina {

    public Maturadora(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
