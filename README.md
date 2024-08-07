# Projeto de Animais

## Objetivo

Aplicar conceitos fundamentais da programação orientada a objetos em Java. Este projeto modela diferentes tipos de animais e calcula suas necessidades energéticas.

## Conceitos Implementados

### Classes e Objetos

**Classes Criadas:**
- **Animal (classe abstrata)**
- **Cachorro (herda de Animal)**
- **Gato (herda de Animal)**

**Objetos:** Instanciados e manipulados em um menu interativo para visualização e manipulação.

### Encapsulamento

- **Atributos:** Propriedades como nome, peso, sexo, etc., são protegidas e acessíveis através de métodos getters e setters.

### Herança

- **Superclasse:** `Animal`
- **Subclasses:** `Cachorro` e `Gato` que estendem `Animal` e herdam suas características e comportamentos.

### Polimorfismo

- **Método Sobrescrito:** `exibirInformacoes()` é implementado de forma diferente em `Cachorro` e `Gato`.

### Sobrecarga e Sobrescrita de Métodos

- **Sobrecarga:** Métodos `calcularNecessidadeEnergeticaPdia` em `Cachorro` e `Gato` são sobrecarregados com diferentes parâmetros.
- **Sobrescrita:** `exibirInformacoes()` é sobrescrito nas subclasses para exibir informações específicas.

### Classes Abstratas e Interfaces

- **Classe Abstrata:** `Animal` define um modelo genérico para todos os animais.
- **Interface:** `Contrato` define o método `exibirInformacoes()` que deve ser implementado.

### Coleções

- **ArrayList:** Utilizado `ArrayList<Animal>` para armazenar e manipular grupos de objetos `Animal`.

### Manipulação de Arquivos
- **Salvar Animais:** Utiliza `BufferedWriter` para salvar os dados dos animais em um arquivo de texto.
- **Carregar Animais:** Utiliza `BufferedReader` para ler os dados dos animais de um arquivo de texto.

### Exceções
- Tratamento de Exceções: Verificação básica de entradas inválidas e tratamento de erros de I/O durante a leitura e escrita de arquivos.

