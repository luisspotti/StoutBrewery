package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class Filtragem extends Processo {
    public Filtragem(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}
