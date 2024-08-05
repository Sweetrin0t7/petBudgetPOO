package com.example;

import java.text.DecimalFormat;

import static java.lang.Math.exp;
import static java.lang.Math.pow;

public class Gato extends Animal{
    private char ehCastrado;
    private char sexo;

    public Gato(String nome, int semanasVida, float peso, float pesoEstimado, char ehObeso, int emRacaoKg, char tipoAnimal, char ehCastrado, char sexo) {
        super(nome, semanasVida, peso, pesoEstimado, ehObeso, emRacaoKg, tipoAnimal);
        this.ehCastrado = ehCastrado;
        this.sexo = sexo;
    }

    public Gato(String nome, int semanasVida, float peso, float pesoEstimado, char ehObeso, int emRacaoKg, char ehCastrado, char sexo) {
        super(nome, semanasVida, peso, pesoEstimado, ehObeso, emRacaoKg);
        this.ehCastrado = ehCastrado;
        this.sexo = sexo;
    }


    public double calcularNecessidadeEnergeticaPdia(float peso, char ehcastrado, char ehobeso, char sexo){
        if (ehobeso == 's') {
            System.out.println("**É recomendável entrar em contato com um veterinario, apesar da necessidade energética aumentar a quantidade de comida, o gato está com risco de vida!");
            return 130 * pow(peso, 0.40);
        } else {
            if (ehobeso == 'n') {
                if (ehcastrado == 's') {
                    if (sexo == 'f') {
                        return 65 * pow(peso, 0.67);
                    } else if (sexo == 'm') {
                        return 75 * pow(peso, 0.67);
                    }
                } else if (ehcastrado == 'n') {
                    return 100 * pow(peso, 0.67);
                } else {
                    System.out.println("Tipo de Dado de Castração inválido");
                }
            } else {
                System.out.println("Tipo de Dado de Obesidade inválido");
            }
        }
        return 0;
    }

    @Override
    public double calcularNecessidadeEnergeticaCrescimento(double NecessidadeEnergetica, float Peso, float PesoEstimado){
        double p = Peso / PesoEstimado ;
        //EM (kcal/dia) = energia necessária para manutenção x 6,7 x [e(-0,189p) – 0,66] | exp para calcular o número de Euler (e)
        return NecessidadeEnergetica * 6.7 * (exp(-0.189 * p) - 0.66);
    };

    @Override
    public void exibirInformacoes() {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double necessidadeEnergeticaDiaria = calcularNecessidadeEnergeticaPdia(getPeso(), ehCastrado, getEhObeso(), sexo);
        float quantidadeComidaDia = calcularQuantidadeComidaGramasDia(necessidadeEnergeticaDiaria);
        double quantidadeComidaMes = calcularQuantidadeComidaGramasMes(quantidadeComidaDia);

        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("Informações do Gato:");
        System.out.println("Nome: " + getNome());
        System.out.println("Necessidade Energética Diária do gato: " + df.format(necessidadeEnergeticaDiaria) + " kcal/g");
        System.out.println("Necessidade de ração para o gato (gramas ao dia): " + df.format(quantidadeComidaDia) + " g/n");
        System.out.println("Necessidade de ração para o Cachorro (gramas ao mes): " + df.format(quantidadeComidaMes) + " g/n");
        System.out.println("------------------------------------------------------------------------\n");
    }

    public char getEhCastrado() {
        return ehCastrado;
    }

    public void setEhCastrado(char ehCastrado) {
        this.ehCastrado = ehCastrado;
    }

    public int getSemanasVida() {
        return semanasVida;
    }

    public void setSemanasVida(int semanasVida) {
        this.semanasVida = semanasVida;
    }
}
