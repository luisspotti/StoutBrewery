package com.bees.brewery;

import com.bees.brewery.ex.VolumeInsuficienteEx;
import com.bees.brewery.ui.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;

public class SwingMainScreen {

    private JFrame frame = null;

    public void execute() {
        //Creating the Frame
        frame = new JFrame("Contorle de produção");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setResizable(false);

        JTabbedPane painel = new JTabbedPane();

        painel.add("Malteação", new MalteacaoPainel(frame));
        painel.add("Brassagem", new BrassagemPainel(frame));
        painel.add("Filtragem", new FiltragemPainel(frame));
        painel.add("Fervura", new FervuraPainel(frame));
        painel.add("Resfriamento", new ResfriamentoPainel(frame));
        painel.add("Fermentação", new FermentacaoPainel(frame));
        painel.add("Envelhecimento", new EnvelhecimentoPainel(frame));
        painel.add("Dry Hopping", new DryHoppingPainel(frame));
        painel.add("Envase", new EnvasePainel(frame));

        //Adding Components to the frame.

        frame.getContentPane().add(BorderLayout.CENTER, painel);
        frame.setVisible(true);
    }

}
