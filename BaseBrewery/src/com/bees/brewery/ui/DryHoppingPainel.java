package com.bees.brewery.ui;

import com.bees.brewery.Controladora;
import com.bees.brewery.ex.VolumeInsuficienteEx;

import javax.swing.*;

public class DryHoppingPainel extends  BasePainel{
    public DryHoppingPainel(JFrame frame) {
        super(frame);
    }

    @Override
    void executarAcao(Float volume) throws VolumeInsuficienteEx {
        Controladora.getInstancia().executarDryHopping(volume);
    }
}
