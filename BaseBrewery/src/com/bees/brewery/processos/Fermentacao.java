package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class Fermentacao extends Processo {
    public Fermentacao(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}
