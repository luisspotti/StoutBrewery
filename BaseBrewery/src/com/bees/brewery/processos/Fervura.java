package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Caldeira;

import java.util.LinkedList;

public class Fervura extends Processo {
    public Fervura() {
       maquinas.add(new Caldeira(2, 15));
    }
}
