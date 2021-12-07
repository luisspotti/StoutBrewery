package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;

import java.util.LinkedList;

public class Brassagem extends Processo {
    public Brassagem(LinkedList<Maquina> maquinas) {
        super(maquinas);
    }
}
