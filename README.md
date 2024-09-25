
# Projeto Java - Exercícios de Lógica e Cálculo

Este projeto contém uma série de exercícios de lógica de programação desenvolvidos em Java. Cada classe aborda um problema específico, com a implementação de soluções claras e documentadas. Este README fornece uma visão geral dos exercícios, descreve o funcionamento de cada programa, e oferece instruções de execução.

## Índice

1. [Introdução](#introdução)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Exercícios](#exercícios)
   - [1. Fibonacci](#1-fibonacci)
   - [2. Percentual de Faturamento](#2-percentual-de-faturamento)
   - [3. Faturamento Diário](#3-faturamento-diário)
   - [4. Inversão de String](#4-inversão-de-string)
   - [5. Soma de Valores](#5-soma-de-valores)
4. [Como Executar](#como-executar)
5. [Autor](#autor)

---

## Introdução

Este projeto foi desenvolvido como parte de exercícios de lógica e cálculos matemáticos em Java. Os códigos são simples, mas fornecem uma sólida base de prática em estruturas de controle, manipulação de strings, e cálculos matemáticos.

Cada classe está devidamente documentada utilizando o padrão Javadoc, explicando o propósito de cada método e a lógica utilizada.

## Tecnologias Utilizadas

- **Java SE 17**
- **IDE de Desenvolvimento**: Pode ser qualquer IDE que suporte Java (como IntelliJ IDEA, Eclipse ou NetBeans)
- **Bibliotecas**: O projeto usa apenas bibliotecas padrão do Java

## Exercícios

### 1. Fibonacci

Classe: `Fibonacci.java`

**Descrição**: Este programa verifica se um número informado pelo usuário pertence à sequência de Fibonacci. Utiliza streams e um método de iteração para calcular os valores da sequência.

### 2. Percentual de Faturamento

Classe: `FaturamentoDistribuidora.java`

**Descrição**: O programa calcula o percentual de faturamento de diferentes estados brasileiros (SP, RJ, MG, ES e outros) em relação ao faturamento total da distribuidora. Os resultados são exibidos em formato percentual.

### 3. Faturamento Diário

Classe: `FaturamentoDiario.java`

**Descrição**: O programa calcula o menor e maior valor de faturamento diário de uma distribuidora, ignorando dias sem faturamento, e também o número de dias em que o faturamento foi superior à média mensal.

### 4. Inversão de String

Classe: `InverterString.java`

**Descrição**: Este programa inverte os caracteres de uma string fornecida pelo usuário, sem utilizar funções prontas como `reverse`.

### 5. Soma de Valores

Classe: `Soma.java`

**Descrição**: O programa calcula a soma dos números inteiros de 1 até um índice pré-definido (neste caso, 13). O cálculo é feito utilizando um laço `while`.

## Como Executar

Para executar qualquer um dos programas, siga os passos abaixo:

1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

2. **Abrir o projeto em uma IDE**:
   - Abra a pasta do projeto em uma IDE de sua preferência.

3. **Compilar e Executar**:
   - Escolha o arquivo Java desejado, por exemplo, `Fibonacci.java`, e execute-o diretamente na IDE.
   - Alternativamente, compile e execute via terminal:
     ```bash
     javac NomeDoArquivo.java
     java NomeDoArquivo
     ```

4. **Exemplos de Execução**:
   - Para o programa `Soma.java`, o resultado esperado será:
     ```bash
     91
     ```

   - Para `FaturamentoDistribuidora.java`, o programa calculará os percentuais de cada estado e exibirá algo similar a:
     ```bash
     Percentual de representação de SP: 37.53%
     Percentual de representação de RJ: 20.28%
     Percentual de representação de MG: 16.17%
     Percentual de representação de ES: 15.06%
     Percentual de representação de Outros: 10.97%
     ```

## Autor

Desenvolvido por **Luiz Henrique de Sousa Costa** - [Contato](mailto:henrisousa7@hotmail.com)

---

Este README fornece um guia detalhado de como interagir com o código. Certifique-se de ler as descrições da documentação no código para obter mais informações sobre o funcionamento de cada exercício.
