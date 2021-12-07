package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Refrigeradora;

import java.util.LinkedList;

public class Resfriamento extends Processo {
    public Resfriamento() {
        maquinas.add(new Refrigeradora());
    }
}
