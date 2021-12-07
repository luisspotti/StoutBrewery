package com.bees.brewery;

import com.bees.brewery.processos.*;

public class Processadora {

    //singleton
    private static Processadora instancia = null;

    private Processadora() {

    }

    public  Processadora getInstancia() {
        if(instancia == null)
            instancia = new Processadora();

        return instancia;
    }

    private Brasagem brasagem = new Brassagem();


}
