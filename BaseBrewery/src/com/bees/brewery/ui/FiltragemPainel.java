package com.bees.brewery.ui;

import com.bees.brewery.Controladora;
import com.bees.brewery.ex.VolumeInsuficienteEx;

import javax.swing.*;

public class FiltragemPainel extends  BasePainel{
    public FiltragemPainel(JFrame frame) {
        super(frame);
    }

    @Override
    void executarAcao(Float volume) throws VolumeInsuficienteEx {
        Controladora.getInstancia().executarFiltragem(volume);
    }
}
