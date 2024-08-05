package com.example;
import java.text.DecimalFormat;
import static java.lang.Math.exp;
import static java.lang.Math.pow;

public class Cachorro extends Animal {

    public Cachorro(String nome, int semanasVida, float peso, float pesoEstimado, char ehObeso, int emRacaoKg, char tipoAnimal) {
        super(nome, semanasVida, peso, pesoEstimado, ehObeso, emRacaoKg, tipoAnimal);
    }

    public Cachorro(String nome, int semanasVida, float peso, float pesoEstimado, char ehObeso, int emRacaoKg) {
        super(nome, semanasVida, peso, pesoEstimado, ehObeso, emRacaoKg);
    }

    public double calcularNecessidadeEnergeticaPdia(float peso, char ehobeso){
        if (ehobeso == 's') {
            System.out.println(" \n   É recomendável entrar em contato com um veterinario, apesar da necessidade energética aumentar a quantidade de comida, o gato está com risco de vida!\n");
            return 95 * pow(peso, 0.75);
        } else {
            if (ehobeso == 'n') {
                return 140 * pow(peso, 0.75);
            } else {
                System.out.println("Tipo de Dado de Obesidade inválido");
            }
        }
        return 0;
    }


    @Override
    public void exibirInformacoes() {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double necessidadeEnergeticaDiaria = calcularNecessidadeEnergeticaPdia(getPeso(), getEhObeso());
        float quantidadeComidaDia = calcularQuantidadeComidaGramasDia(necessidadeEnergeticaDiaria);
        double quantidadeComidaMes = calcularQuantidadeComidaGramasMes(quantidadeComidaDia);

        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("Informações do Cachorro:");
        System.out.println("Nome: " + getNome());
        System.out.println("Necessidade Energética Diária: " + df.format(necessidadeEnergeticaDiaria) + " kcal/g");
        System.out.println("Necessidade de ração para o Cachorro (gramas ao dia): " + df.format(quantidadeComidaDia) + " g/n");
        System.out.println("Necessidade de ração para o Cachorro (gramas ao mes): " + df.format(quantidadeComidaMes) + " g/n");
        System.out.println("------------------------------------------------------------------------\n");
    }

    @Override
    public double calcularNecessidadeEnergeticaCrescimento(double NecessidadeEnergetica, float Peso, float PesoEstimado){
        double p = Peso / PesoEstimado ;
        //EM (kcal/dia) = energia necessária para manutenção x 6,7 x [e(-0,189p) – 0,66] | exp para calcular o número de Euler (e)
        return NecessidadeEnergetica * 3.2 * (exp(-0.87 * p) - 0.1);
    };
}
