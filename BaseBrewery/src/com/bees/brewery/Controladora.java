package com.bees.brewery;

import com.bees.brewery.ex.VolumeInsuficienteEx;
import com.bees.brewery.processos.*;

public class Controladora {

    //singleton
    private static Controladora instancia = null;

    private Controladora() {

    }

    public static Controladora getInstancia() {
        if (instancia == null)
            instancia = new Controladora();

        return instancia;
    }

    //Processos
    private Brassagem brassagem = new Brassagem();
    private Armazenamento totBrassagem = new Armazenamento();

    public void executarBrassagem(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > getTotMalteacao().getVolume())
            throw new VolumeInsuficienteEx();

        getTotBrassagem().addVolume(brassagem.executarProcesso(totalListros));
        getTotMalteacao().removeVolume(totalListros);
    }

    private DryHopping dryHopping = new DryHopping();
    private Armazenamento totDryHopping = new Armazenamento();

    public void executarDryHopping(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > getTotEnvelhecimento().getVolume())
            throw new VolumeInsuficienteEx();

        getTotDryHopping().addVolume(dryHopping.executarProcesso(totalListros));
        getTotEnvelhecimento().removeVolume(totalListros);
    }

    private Envelhecimento envelhecimento = new Envelhecimento();
    private Armazenamento totEnvelhecimento = new Armazenamento();

    public void executarEnvelhecimento(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > getTotFermentacao().getVolume())
            throw new VolumeInsuficienteEx();

        getTotEnvelhecimento().addVolume(envelhecimento.executarProcesso(totalListros));
        getTotFermentacao().removeVolume(totalListros);
    }

    private Fermentacao fermentacao = new Fermentacao();
    private Armazenamento totFermentacao = new Armazenamento();

    public void executarFermentacao(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > getTotResfriamento().getVolume())
            throw new VolumeInsuficienteEx();

        getTotFermentacao().addVolume(fermentacao.executarProcesso(totalListros));
        getTotResfriamento().removeVolume(totalListros);
    }

    private Fervura fervura = new Fervura();
    private Armazenamento totFervura = new Armazenamento();

    public void executarFervura(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > getTotFiltragem().getVolume())
            throw new VolumeInsuficienteEx();

        getTotFervura().addVolume(fervura.executarProcesso(totalListros));
        getTotFiltragem().removeVolume(totalListros);
    }

    private Envase envase = new Envase();
    private Armazenamento totEnvase = new Armazenamento();

    //TOOD: Mudar depois para calcular a partir do tipo de container
    public void executarEnvase(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > getTotDryHopping().getVolume())
            throw new VolumeInsuficienteEx();

        getTotEnvase().addVolume(fervura.executarProcesso(totalListros));
        getTotDryHopping().removeVolume(totalListros);
    }

    private Filtragem filtragem = new Filtragem();
    private Armazenamento totFiltragem = new Armazenamento();

    public void executarFiltragem(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > getTotBrassagem().getVolume())
            throw new VolumeInsuficienteEx();

        getTotFiltragem().addVolume(filtragem.executarProcesso(totalListros));
        getTotBrassagem().removeVolume(totalListros);
    }

    private Malteacao malteacao = new Malteacao();
    private Armazenamento totMalteacao = new Armazenamento();

    public void executarMalteacao(float totalListros) throws VolumeInsuficienteEx {
        getTotMalteacao().addVolume(malteacao.executarProcesso(totalListros));
    }

    private Resfriamento resfriamento = new Resfriamento();
    private Armazenamento totResfriamento = new Armazenamento();

    public void executarResfriamento(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > getTotFervura().getVolume())
            throw new VolumeInsuficienteEx();

        getTotResfriamento().addVolume(resfriamento.executarProcesso(totalListros));
        getTotFervura().removeVolume(totalListros);
    }

    public Armazenamento getTotBrassagem() {
        return totBrassagem;
    }

    public Armazenamento getTotDryHopping() {
        return totDryHopping;
    }

    public Armazenamento getTotEnvelhecimento() {
        return totEnvelhecimento;
    }

    public Armazenamento getTotFermentacao() {
        return totFermentacao;
    }

    public Armazenamento getTotFervura() {
        return totFervura;
    }

    public Armazenamento getTotEnvase() {
        return totEnvase;
    }

    public Armazenamento getTotFiltragem() {
        return totFiltragem;
    }

    public Armazenamento getTotMalteacao() {
        return totMalteacao;
    }

    public Armazenamento getTotResfriamento() {
        return totResfriamento;
    }
}
