package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class Resfriamento extends Processo {
    public Resfriamento(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}
