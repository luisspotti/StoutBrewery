package com.bees.brewery;

import com.bees.brewery.ui.*;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class SwingMainScreen implements Observer {

    private JFrame frame = null;
    private JLabel labelTotalMalteacao = null;
    private JLabel labelTotalBrassagem = null;
    private JLabel labelTotalFiltragem = null;
    private JLabel labelTotalFervura = null;
    private JLabel labelTotalResfriamento = null;
    private JLabel labelTotalFermentacao = null;
    private JLabel labelTotalEnvelhecimento = null;
    private JLabel labelTotalDryHopping = null;
    private JLabel labelTotalEnvase = null;

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

        Controladora controladora = Controladora.getInstancia();
        controladora.addObserver(this);

        GridLayout layoutTotais = new GridLayout(9, 1);
        JPanel painelTotais = new JPanel();
        painelTotais.setLayout(layoutTotais);
        labelTotalMalteacao = new JLabel();
        labelTotalBrassagem = new JLabel();
        labelTotalFiltragem = new JLabel();
        labelTotalFervura = new JLabel();
        labelTotalResfriamento = new JLabel();
        labelTotalFermentacao = new JLabel();
        labelTotalEnvelhecimento = new JLabel();
        labelTotalDryHopping = new JLabel();
        labelTotalEnvase = new JLabel();

        atualizarTotais(controladora);

        painelTotais.add(labelTotalMalteacao);
        painelTotais.add(labelTotalBrassagem);
        painelTotais.add(labelTotalFiltragem);
        painelTotais.add(labelTotalFervura);
        painelTotais.add(labelTotalResfriamento);
        painelTotais.add(labelTotalFermentacao);
        painelTotais.add(labelTotalEnvelhecimento);
        painelTotais.add(labelTotalDryHopping);
        painelTotais.add(labelTotalEnvase);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, painelTotais);
        frame.getContentPane().add(BorderLayout.CENTER, painel);
        frame.setVisible(true);
    }

    private void atualizarTotalMalteacao(float total) {
        labelTotalMalteacao.setText("Total malteação: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotalBrassagem(float total) {
        labelTotalBrassagem.setText("Total brassagem: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotalFiltragem(float total) {
        labelTotalFiltragem.setText("Total filtragem: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotalFervura(float total) {
        labelTotalFervura.setText("Total fervura: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotalResfriamento(float total) {
        labelTotalResfriamento.setText("Total resfriamento: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotalFermentacao(float total) {
        labelTotalFermentacao.setText("Total fermentação: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotalEnvelhecimento(float total) {
        labelTotalEnvelhecimento.setText("Total envelhecimento: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotalDryHopping(float total) {
        labelTotalDryHopping.setText("Total dry hopping: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotalEnvase(float total) {
        labelTotalEnvase.setText("Total envase: ".concat(String.format("%.2f", total)));
    }

    private void atualizarTotais(Controladora controladora) {
        float totalMalteacao = controladora.getTotMalteacao().getVolume();
        float totalBrassagem = controladora.getTotBrassagem().getVolume();
        float totalFiltragem = controladora.getTotFiltragem().getVolume();
        float totalFervura = controladora.getTotFervura().getVolume();
        float totalResfriamento = controladora.getTotResfriamento().getVolume();
        float totalFermentacao = controladora.getTotFermentacao().getVolume();
        float totalEnvelhecimento = controladora.getTotEnvelhecimento().getVolume();
        float totalDryHopping = controladora.getTotDryHopping().getVolume();
        float totalEnvase = controladora.getTotEnvase().getVolume();

        atualizarTotalMalteacao(totalMalteacao);
        atualizarTotalBrassagem(totalBrassagem);
        atualizarTotalFiltragem(totalFiltragem);
        atualizarTotalFervura(totalFervura);
        atualizarTotalResfriamento(totalResfriamento);
        atualizarTotalFermentacao(totalFermentacao);
        atualizarTotalEnvelhecimento(totalEnvelhecimento);
        atualizarTotalDryHopping(totalDryHopping);
        atualizarTotalEnvase(totalEnvase);
    }

    @Override
    public void update(Observable controladora, Object arg1) {
        if (controladora instanceof Controladora) {
            Controladora controlador = (Controladora) controladora;
            atualizarTotais(controlador);
        }
    }
}
