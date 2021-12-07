package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class Envelhecimento extends Processo {
    public Envelhecimento(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}
