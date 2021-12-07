package com.bees.brewery.maquinas;

import com.bees.brewery.Maquina;

public class Filtro extends Maquina {

    public Filtro(int taxaDePerdas, long tempoDeExecucao) {
        super(taxaDePerdas, tempoDeExecucao);
    }

    @Override
    protected Boolean executar() {
        return null;
    }
}
