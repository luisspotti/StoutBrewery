package com.bees.brewery;

import com.bees.brewery.ex.VolumeInsuficienteEx;
import com.bees.brewery.processos.*;

public class Controladora {

    //singleton
    private static Controladora instancia = null;

    private Controladora() {

    }

    public Controladora getInstancia() {
        if (instancia == null)
            instancia = new Controladora();

        return instancia;
    }

    //Processos
    private Brassagem brassagem = new Brassagem();
    private Armazenamento totBrassagem = new Armazenamento();

    public void executarBrassagem(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > totMalteascao.getVolume())
            throw new VolumeInsuficienteEx();

        totBrassagem.addVolume(brassagem.executarProcesso(totalListros));
        totMalteascao.removeVolume(totalListros);
    }

    private DryHopping dryHopping = new DryHopping();
    private Armazenamento totDryHopping = new Armazenamento();

    public void executarDryHopping(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > totEnvelhecimento.getVolume())
            throw new VolumeInsuficienteEx();

        totDryHopping.addVolume(dryHopping.executarProcesso(totalListros));
        totEnvelhecimento.removeVolume(totalListros);
    }

    private Envelhecimento envelhecimento = new Envelhecimento();
    private Armazenamento totEnvelhecimento = new Armazenamento();

    public void executarEnvelhecimento(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > totFermentacao.getVolume())
            throw new VolumeInsuficienteEx();

        totEnvelhecimento.addVolume(envelhecimento.executarProcesso(totalListros));
        totFermentacao.removeVolume(totalListros);
    }

    private Fermentacao fermentacao = new Fermentacao();
    private Armazenamento totFermentacao = new Armazenamento();

    public void executarFermentacao(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > totResfriamento.getVolume())
            throw new VolumeInsuficienteEx();

        totFermentacao.addVolume(fermentacao.executarProcesso(totalListros));
        totResfriamento.removeVolume(totalListros);
    }

    private Fervura fervura = new Fervura();
    private Armazenamento totFervura = new Armazenamento();

    public void executarFervura(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > totFiltragem.getVolume())
            throw new VolumeInsuficienteEx();

        totFervura.addVolume(fervura.executarProcesso(totalListros));
        totFiltragem.removeVolume(totalListros);
    }

    private Envase envase = new Envase();
    private Armazenamento totEnvase = new Armazenamento();

    //TOOD: Mudar depois para calcular a partir do tipo de container
    public void executarEnvase(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > totDryHopping.getVolume())
            throw new VolumeInsuficienteEx();

        totEnvase.addVolume(fervura.executarProcesso(totalListros));
        totDryHopping.removeVolume(totalListros);
    }

    private Filtragem filtragem = new Filtragem();
    private Armazenamento totFiltragem = new Armazenamento();

    public void executarFiltragem(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > totBrassagem.getVolume())
            throw new VolumeInsuficienteEx();

        totFiltragem.addVolume(filtragem.executarProcesso(totalListros));
        totBrassagem.removeVolume(totalListros);
    }

    private Malteacao malteacao = new Malteacao();
    private Armazenamento totMalteascao = new Armazenamento();

    public void executarMalteacao(float totalListros) throws VolumeInsuficienteEx {
        totMalteascao.addVolume(malteacao.executarProcesso(totalListros));
    }

    private Resfriamento resfriamento = new Resfriamento();
    private Armazenamento totResfriamento = new Armazenamento();

    public void executarResfriamento(float totalListros) throws VolumeInsuficienteEx {
        if (totalListros > totFervura.getVolume())
            throw new VolumeInsuficienteEx();

        totResfriamento.addVolume(resfriamento.executarProcesso(totalListros));
        totFervura.removeVolume(totalListros);
    }
}
