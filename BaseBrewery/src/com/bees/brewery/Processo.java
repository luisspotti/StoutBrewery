package com.bees.brewery;

import java.util.LinkedList;

public abstract class Processo {
    protected LinkedList<Maquina> maquinas = new LinkedList<>();

    public float executarProcesso(float totalParaProcessar) {
        for (Maquina m : maquinas) {
            m.executar();
            totalParaProcessar = totalParaProcessar - (totalParaProcessar * m.taxaDePerdas);
        }

        return totalParaProcessar;
    }
}
