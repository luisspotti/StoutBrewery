package com.bees.brewery.ui;

import com.bees.brewery.ex.VolumeInsuficienteEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class BasePainel extends JPanel {

    public JButton buttonAction;

    public BasePainel(JFrame frame){
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        this.setLayout(layout);

        JLabel label = new JLabel("Total a processar:");

        JTextField field = new JTextField();
        field.setColumns(10);

        buttonAction = new JButton("Executar");
        buttonAction.addActionListener(e -> {
            try {
                float valor = Float.parseFloat(field.getText());
                executarAcao(valor);
            } catch (VolumeInsuficienteEx ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        });

        this.add(label);
        this.add(field);
        this.add(buttonAction);
    }

    abstract void executarAcao(Float volume) throws VolumeInsuficienteEx;
}
