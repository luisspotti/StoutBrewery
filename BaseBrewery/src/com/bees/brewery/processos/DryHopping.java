package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class DryHopping extends Processo {
    public DryHopping(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}