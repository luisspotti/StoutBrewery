package com.bees.brewery.ui;

import com.bees.brewery.Controladora;
import com.bees.brewery.ex.VolumeInsuficienteEx;

import javax.swing.*;

public class FermentacaoPainel extends  BasePainel{
    public FermentacaoPainel(JFrame frame) {
        super(frame);
    }

    @Override
    void executarAcao(Float volume) throws VolumeInsuficienteEx {
        Controladora.getInstancia().executarFermentacao(volume);
    }
}
