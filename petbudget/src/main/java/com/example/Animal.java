package com.example;

public abstract class Animal implements Contrato{
    protected String nome;
    protected int semanasVida;
    protected float peso;
    protected float pesoEstimado;
    protected char ehObeso;
    protected int emRacaoKg;
    protected char tipoAnimal;

    public Animal(String nome, int semanasVida, float peso, float pesoEstimado, char ehObeso, int emRacaoKg, char tipoAnimal) {
        this.nome = nome;
        this.semanasVida = semanasVida;
        this.peso = peso;
        this.pesoEstimado = pesoEstimado;
        this.ehObeso = ehObeso;
        this.emRacaoKg = emRacaoKg;
        this.tipoAnimal = tipoAnimal;
    }

    public Animal(String nome, int semanasVida, float peso, float pesoEstimado, char ehObeso, int emRacaoKg) {
        this.nome = nome;
        this.semanasVida = semanasVida;
        this.peso = peso;
        this.pesoEstimado = pesoEstimado;
        this.ehObeso = ehObeso;
        this.emRacaoKg = emRacaoKg;
    }


    public abstract double calcularNecessidadeEnergeticaCrescimento(double NecessidadeEnergetica, float Peso, float PesoEstimado);

    public float calcularQuantidadeComidaGramasDia(double necessidadeEnergetica) {
        return (float) ((necessidadeEnergetica / emRacaoKg) * 1000);
    }

    public float calcularQuantidadeComidaGramasMes(float quantidadeComidaDia) {
        return quantidadeComidaDia * 30;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getEhObeso() {
        return ehObeso;
    }

    public void setEhObeso(char ehObeso) {
        this.ehObeso = ehObeso;
    }

    public int getEmRacaoKg() {
        return emRacaoKg;
    }

    public void setEmRacaoKg(int emRacaoKg) {
        this.emRacaoKg = emRacaoKg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemanasVida() {
        return semanasVida;
    }

    public void setSemanasVida(int semanasVida) {
        this.semanasVida = semanasVida;
    }

    public float getPesoEstimado() {
        return pesoEstimado;
    }

    public void setPesoEstimado(float pesoEstimado) {
        this.pesoEstimado = pesoEstimado;
    }

    public char getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(char tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}

