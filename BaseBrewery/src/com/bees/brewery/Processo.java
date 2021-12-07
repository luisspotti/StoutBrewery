package com.bees.brewery;

import java.util.LinkedList;

public abstract class Processo {
    protected LinkedList<Maquina> maquinas = new LinkedList<>();


    public Boolean executarProcesso() {
        Boolean retorno = true;
        for (Maquina m : maquinas) {
            retorno = retorno && m.executar();
        }

        return retorno;
    }
}
