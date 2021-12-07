package com.bees.brewery;

public abstract class Maquina {

    public Maquina(int taxaDePerdas, long tempoDeExecucao) {
        this.taxaDePerdas = taxaDePerdas;
        this.tempoDeExecucao = tempoDeExecucao;
    }

    /**
     * Capacidade da maquina (kg), positivo. Ex: 99.2 kg
     */
    protected float capacidade;

    /**
     * Vazao da maquina (kg/seg), positivo. Ex: 50.2 kg/seg
     */
    protected float vazao;

    protected int taxaDePerdas;

    protected long tempoDeExecucao;

    /**
     * Executar processo da maquina
     *
     * @param p processo
     * @return true se com sucesso, false com falha.
     */
    protected abstract Boolean executar();

    /**
     * Taxa de perdas de material da maquina, em %, positivo. Ex: 2.5%
     */
    public int getTaxaDePerdas() {
        return taxaDePerdas;
    }

    public void setTaxaDePerdas(int taxaDePerdas) {
        this.taxaDePerdas = taxaDePerdas;
    }

    /**
     * Tempo de execução da maquina, em segundos. Ex: 1000 seg
     */
    public long getTempoDeExecucao() {
        return tempoDeExecucao;
    }

    public void setTempoDeExecucao(long tempoDeExecucao) {
        this.tempoDeExecucao = tempoDeExecucao;
    }
}
