package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class Fervura extends Processo {
    public Fervura(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}
