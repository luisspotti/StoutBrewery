package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Maturadora;

import java.util.LinkedList;

public class DryHopping extends Processo {
    public DryHopping() {
        maquinas.add(new Maturadora(1,30));
    }
}