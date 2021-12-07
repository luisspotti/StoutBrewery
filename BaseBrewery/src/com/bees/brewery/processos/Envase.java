package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class Envase extends Processo {
    public Envase(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}
