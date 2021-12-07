package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Secadora;
import com.bees.brewery.maquinas.Torra;
import com.bees.brewery.maquinas.Umidificador;

import java.util.LinkedList;

public class Malteacao extends Processo {
    public Malteacao() {
        maquinas.add(new Umidificador());
        maquinas.add(new Secadora());
        maquinas.add(new Torra());
    }
}