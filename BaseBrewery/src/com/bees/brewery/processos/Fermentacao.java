package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Fermentadora;

import java.util.LinkedList;

public class Fermentacao extends Processo {
    public Fermentacao() {
        maquinas.add(new Fermentadora());
    }
}
