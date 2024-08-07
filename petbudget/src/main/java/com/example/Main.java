package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();

        // Menu
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Animal");
            System.out.println("2. Exibir Informações dos Animais");
            System.out.println("3. Salvar Animais em Arquivo");
            System.out.println("4. Carregar Animais de Arquivo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Animal: ");
                    String nome = scanner.nextLine();
                    System.out.print("Peso (kg): ");
                    float peso = scanner.nextFloat();
                    System.out.print("Peso Estimado (kg): ");
                    float pesoEstimado = scanner.nextFloat();
                    System.out.print("Obeso (s/n): ");
                    char ehObeso = scanner.next().charAt(0);
                    System.out.print("Sexo (f/m): ");
                    char sexo = scanner.next().charAt(0);
                    System.out.print("Energia Metabolizável da Ração (kg): ");
                    int emRacaoKg = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Tipo de Animal (c/g): ");
                    char tipoAnimal = scanner.next().charAt(0);

                    Animal animal;
                    if (tipoAnimal == 'c') {
                        animal = new Cachorro(nome, 0, peso, pesoEstimado, ehObeso, emRacaoKg);
                    } else if (tipoAnimal == 'g') {
                        System.out.print("Castração (s/n): ");
                        char ehCastrado = scanner.next().charAt(0);
                        animal = new Gato(nome, 0, peso, pesoEstimado, ehObeso, emRacaoKg, ehCastrado, sexo);
                    } else {
                        System.out.println("Tipo de animal inválido.");
                        continue;
                    }

                    animais.add(animal);
                    break;

                case 2:
                    for (Animal a : animais) {
                        a.exibirInformacoes();
                    }
                    break;

                case 3:
                    ArquivoUtils.salvarAnimaisEmArquivo(animais, "animais.txt");
                    break;

                case 4:
                    animais = ArquivoUtils.carregarAnimaisDeArquivo("animais.txt");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
