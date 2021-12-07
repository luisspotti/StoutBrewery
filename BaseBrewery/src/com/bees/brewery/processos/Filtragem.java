package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Filtro;

import java.util.LinkedList;

public class Filtragem extends Processo {
    public Filtragem() {
        maquinas.add(new Filtro(0, 1));
    }
}
