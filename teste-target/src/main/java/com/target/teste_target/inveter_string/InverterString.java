package com.target.teste_target.inveter_string;

import java.util.Scanner;

/**
 * InverterString
 * <p> A Classe InverterString foi criada para inverter os caracteres
 * de uma string fornecida pelo usuário ou predefinida no código.
 * 
 * @author Luiz Henrique de Sousa Costa
 * @version 1.0
 * @since 25/09/2024
 */

public class InverterString {
    
     /**
     * O método principal recebe uma string do usuário e inverte seus caracteres
     * sem utilizar funções prontas, como reverse.
     * 
     * @param args Argumentos da linha de comando, não utilizados.
     */
    public static void main(String[] args) {
        // Entrada da string através do console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String original = scanner.nextLine();
        
        // Variável para armazenar a string invertida
        String invertida = "";

        // Laço para percorrer a string de trás para frente
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i); // Adiciona o caractere na nova string
        }

        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
}

