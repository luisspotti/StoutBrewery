package com.bees.brewery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.util.concurrent.Flow;

public class SwingMainScreen implements PropertyChangeListener {

    public void execute() {
        //Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
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

        painel.add("Malteação", panelMalteacao);
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

        JFormattedTextField field = new JFormattedTextField(NumberFormat.getNumberInstance());
        field.setValue((double) 0);
        field.setColumns(30);
        field.addPropertyChangeListener("value", this);

        panel.add(label);
        panel.add(field);

        return panel;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
