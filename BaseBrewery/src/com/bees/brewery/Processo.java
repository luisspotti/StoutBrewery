package com.bees.brewery;

import java.util.LinkedList;

public abstract class Processo {
    private LinkedList<Maquina> maquinas;

    public Processo(LinkedList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }


    public Boolean ExecutarProcesso() {
        Boolean retorno = true;
        for (Maquina m : maquinas) {
            retorno = retorno && m.executar();
        }

        return retorno;
    }
}
