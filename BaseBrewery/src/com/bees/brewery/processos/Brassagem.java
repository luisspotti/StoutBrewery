package com.bees.brewery.processos;

import com.bees.brewery.Maquina;
import com.bees.brewery.Processo;
import com.bees.brewery.maquinas.Caldeira;
import com.bees.brewery.maquinas.Moinho;

import javax.imageio.ImageReader;
import java.util.LinkedList;

public class Brassagem extends Processo {
    public Brassagem() {
        maquinas.add(new Moinho());
        maquinas.add(new Caldeira());
    }
}
