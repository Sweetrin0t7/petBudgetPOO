package com.example;

import java.io.*;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class ArquivoUtils {

    public static void salvarAnimaisEmArquivo(ArrayList<Animal> animais, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Animal animal : animais) {
                writer.write(animal.toString());
                writer.newLine();
            }
            System.out.println("Animais salvos com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar animais em arquivo: " + e.getMessage());
        }
    }

    public static ArrayList<Animal> carregarAnimaisDeArquivo(String nomeArquivo) {
        ArrayList<Animal> animais = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Animal animal = parseAnimal(linha);
                if (animal != null) {
                    animais.add(animal);
                }
            }
            System.out.println("Animais carregados com sucesso de " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao carregar animais de arquivo: " + e.getMessage());
        }
        return animais;
    }

    private static Animal parseAnimal(String linha) {
        String[] partes = linha.split(",");
        if (partes.length < 5) {
            System.err.println("Linha de dados inválida: " + linha);
            return null; // Linha inválida
        }
        String tipo = partes[0];
        String nome = partes[1];
        float peso = Float.parseFloat(partes[2]);
        char ehObeso = partes[3].charAt(0); // Assume 's' ou 'n'
        int emRacaoKg = parseInt(partes[4]) ; // Ajuste para evitar valores inválidos
        char sexo = partes.length > 5 ? partes[5].charAt(0) : ' '; // Pode ser ' ' se não estiver presente
        char ehCastrado = partes.length > 6? partes[6].charAt(0) : ' '; // Pode ser ' ' se não estiver presente


        if (tipo.equals("Cachorro")) {
            return new Cachorro(nome, peso, ehObeso, emRacaoKg);
        } else if (tipo.equals("Gato")) {
            return new Gato(nome, peso, ehObeso, sexo, ehCastrado, emRacaoKg);
        }
        return null;
    }




}
