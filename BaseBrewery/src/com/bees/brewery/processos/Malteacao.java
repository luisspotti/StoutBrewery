package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class Malteacao extends Processo {
    public Malteacao(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}