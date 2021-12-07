package com.bees.brewery;

import com.bees.brewery.ex.VolumeInsuficienteEx;
import com.bees.brewery.ui.MalteacaoPainel;

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

        JPanel panelMalteacao = getPainelMalteacao();
        JPanel panelBrassagem = new JPanel();
        JPanel panelFiltragem = new JPanel();
        JPanel panelFervura = new JPanel();
        JPanel panelResfriamento = new JPanel();
        JPanel panelFermentacao = new JPanel();
        JPanel panelEnvelhecimento = new JPanel();
        JPanel panelDryHopping = new JPanel();
        JPanel panelEnvase = new JPanel();

        painel.add("Malteação", new MalteacaoPainel(frame));
        painel.add("Brassagem", panelBrassagem);
        painel.add("Filtragem", panelFiltragem);
        painel.add("Fervura", panelFervura);
        painel.add("Resfriamento", panelResfriamento);
        painel.add("Fermentação", panelFermentacao);
        painel.add("Envelhecimento", panelEnvelhecimento);
        painel.add("Dry Hopping", panelDryHopping);
        painel.add("Envase", panelEnvase);

        //Adding Components to the frame.

        frame.getContentPane().add(BorderLayout.CENTER, painel);
        frame.setVisible(true);
    }

    private JPanel getPainelMalteacao() {
        JPanel panel = new JPanel();

        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        panel.setLayout(layout);

        JLabel label = new JLabel("Total a processar:");

        JTextField field = new JTextField();
        field.setColumns(10);

        JButton buttonAction = new JButton("Executar");
        buttonAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float tot = Float.parseFloat(field.getText());
                try {
                    Controladora.getInstancia().executarMalteacao(tot);
                } catch (VolumeInsuficienteEx ex) {
                    JOptionPane.showMessageDialog(frame, "Total de volume insuficiente!");
                }
            }
        });

        panel.add(label);
        panel.add(field);
        panel.add(buttonAction);
        return panel;
    }

}
