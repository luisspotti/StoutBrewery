package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Envasadora;

import java.util.LinkedList;

public class Envase extends Processo {
    public Envase() {
        maquinas.add(new Envasadora(1, 5));
    }
}
