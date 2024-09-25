package com.target.teste_target.fibonacci;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.InputMismatchException;

/**
 * Fibonacci
 * <p> A Classe Fibonacci foi criada para verificar se o número pertence
 * ou não pertence a sequência de Fibonacci.
 * 
 * @author Luiz Henrique de Sousa Costa
 * @version 1.0
 * @since 25/09/2024
 */

public class Fibonacci {

    /**
     * A Classe  tem a função de verificar se o número digitado pelo usuario
     * pertence ou não pertence a sequência de Fibonacci.
     * @param num recebera um valor do tipo Int.
     * @return o Método retornara True se o valor recebido pelo parâmetro num
     * pertencer a sequência de Fibonacci caso não ele retornara False.
     */
    public static boolean isFibonacci(int num) {
        return num >= 0 && Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                                  .map(f -> f[0])
                                  .takeWhile(f -> f <= num)
                                  .anyMatch(f -> f == num);
    }

    public static void main(String[] args) {
        // Instância do Scanner para receber um valor do usuário.
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Informe o número que deseja saber se pertence a sequência de Fibonacci: ");
            // Variavel do tipo inteiro para armazenar o valor do usuário.
            int numero = sc.nextInt();
            
            // Estrutura de decisão para visualizar o resultado.
            System.out.println("O número " + numero + 
            (isFibonacci(numero) ? " pertence" : " não pertence") + 
            " à sequência de Fibonacci.");
            
            // Exception caso o usuário digite um tipo diferente de inteiro.
        } catch (InputMismatchException e) {
            System.out.println("Erro: O valor informado não é um número inteiro válido.");
        } finally {
            sc.close();
    }
}
}