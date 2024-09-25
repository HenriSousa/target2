package com.target.teste_target.faturamento;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.OptionalDouble;

/**
 * FaturamentoDiario
 * <p> A Classe FaturamentoDiario foi criada para calcular o menor e maior valor de faturamento
 * diário e a quantidade de dias em que o faturamento foi superior à média mensal.
 * 
 * @author Luiz Henrique de Sousa Costa
 * @version 1.0
 * @since 25/09/2024
 */

public class FaturamentoDiario {


    /**
     * O método principal calcula e retorna o menor e maior valor de faturamento diário,
     * e o número de dias que o faturamento foi superior à média mensal.
     * 
     * @param faturamentoValores Lista com os valores diários de faturamento.
     */


    static class DiaFaturamento {
        public int dia;
        public double valor;

        public DiaFaturamento() {
        }

        public DiaFaturamento(int dia, double valor) {
            this.dia = dia;
            this.valor = valor;
        }
    }

    public static void main(String[] args) {;
       ObjectMapper mapper = new ObjectMapper();
        try {
            // Ler os dados do JSON
            List<DiaFaturamento> faturamentos = mapper.readValue(
                    new File("teste-target\\src\\main\\java\\com\\target\\teste_target\\faturamento\\faturamento.json"),
                    new TypeReference<List<DiaFaturamento>>() {
                    });

            // Filtrar os dias com faturamento > 0
            List<DiaFaturamento> diasComFaturamento = faturamentos.stream()
                    .filter(dia -> dia.valor > 0)
                    .toList();

            // Encontrar o menor e maior valor de faturamento
            double menorFaturamento = diasComFaturamento.stream()
                    .mapToDouble(dia -> dia.valor)
                    .min()
                    .orElse(0);

            double maiorFaturamento = diasComFaturamento.stream()
                    .mapToDouble(dia -> dia.valor)
                    .max()
                    .orElse(0);

            // Calcular a média mensal de faturamento (somente dias com faturamento > 0)
            OptionalDouble media = diasComFaturamento.stream()
                    .mapToDouble(dia -> dia.valor)
                    .average();

            if (media.isPresent()) {
                double mediaFaturamento = media.getAsDouble();

                // Contar os dias com faturamento superior à média
                long diasAcimaDaMedia = diasComFaturamento.stream()
                        .filter(dia -> dia.valor > mediaFaturamento)
                        .count();

                // Exibir os resultados
                System.out.println("Menor valor de faturamento: " + menorFaturamento);
                System.out.println("Maior valor de faturamento: " + maiorFaturamento);
                System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
            } else {
                System.out.println("Não foi possível calcular a média.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
