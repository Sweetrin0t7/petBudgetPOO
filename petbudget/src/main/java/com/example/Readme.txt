README - Projeto de Animais
Objetivo
Aplicar conceitos fundamentais da programação orientada a objetos em Java. Este projeto inclui a modelagem de diferentes tipos de animais e o cálculo de suas necessidades energéticas.

Conceitos Implementados
Classes e Objetos

Classes Criadas:
Animal (classe abstrata)
Cachorro (herda de Animal)
Gato (herda de Animal)
Objetos: Instanciados em um menu interativo para manipulação e visualização.
Encapsulamento

Atributos: Propriedades como nome, peso, sexo, etc., são protegidas e acessíveis através de métodos getters e setters.
Herança

Superclasse: Animal
Subclasses: Cachorro e Gato que estendem Animal e herdam suas características e comportamentos.
Polimorfismo

Método Sobrescrito: exibirInformacoes() é implementado de forma diferente em Cachorro e Gato.
Sobrecarga e Sobrescrita de Métodos

Sobrecarga: Métodos calcularNecessidadeEnergeticaPdia em Cachorro e Gato são sobrecarregados com diferentes parâmetros.
Sobrescrita: exibirInformacoes() é sobrescrito nas subclasses para exibir informações específicas.
Classes Abstratas e Interfaces

Classe Abstrata: Animal define um modelo genérico para todos os animais.
Interface: Contrato define o método exibirInformacoes() que deve ser implementado.
Coleções

Utilizado ArrayList<Animal> para armazenar e manipular grupos de objetos Animal.
Manipulação de Arquivos

Não Implementado: O projeto não inclui funcionalidades para salvar ou carregar dados de arquivos.
Exceções

Tratamento de Exceções: Verificação básica de entradas inválidas, mas não há tratamento de exceções avançado.