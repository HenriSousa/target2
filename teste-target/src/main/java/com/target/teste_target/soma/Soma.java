package com.target.teste_target.soma;

/**
 * Soma
 * <p> A Classe Soma foi criada para calcular a soma dos números inteiros de 1 até o valor
 * do índice especificado, utilizando um laço de repetição.
 * 
 * @author Luiz Henrique de Sousa Costa
 * @version 1.0
 * @since 25/09/2024
 */

public class Soma {

    /**
     * O método principal realiza a soma dos números inteiros de 1 até o valor definido na
     * variável "indice". O resultado da soma é exibido no console.
     * 
     * @param args Argumentos da linha de comando, não utilizados.
     */
    public static void main(String[] args) {
        // Variável que define o valor limite para o laço
        int indice = 13;
       
        // Variável que armazena o valor acumulado da soma
        int soma = 0;
       
       // Variável de controle do laço
        int k = 0;

        // Laço de repetição que realiza a soma de 1 até o valor de "indice"
        while(k < indice) {
            k = k +1; // Incrementa o valor de k
            soma = soma + k; // Adiciona o valor de k à soma
        }

        // Exibe o resultado da soma no console
        System.out.println(soma);
    }
    
}