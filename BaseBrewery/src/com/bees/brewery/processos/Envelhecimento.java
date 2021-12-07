package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Maturadora;

import java.util.LinkedList;

public class Envelhecimento extends Processo {
    public Envelhecimento() {
        maquinas.add(new Maturadora());
    }
}
