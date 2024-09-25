package com.target.teste_target.faturamento_distribuidora;

/**
 * FaturamentoDistribuidora
 * <p> A Classe FaturamentoDistribuidora foi criada para calcular o percentual 
 * de faturamento mensal de uma distribuidora em relação a diferentes estados.
 * 
 * @author Luiz Henrique de Sousa Costa
 * @version 1.0
 * @since 25/09/2024
 */

public class FaturamentoDistribuidora {

    /**
     * O método principal calcula o percentual de representação de cada estado
     * em relação ao valor total de faturamento da distribuidora.
     * @param args Argumentos da linha de comando, não utilizados.
     */    
    
    public static void main(String[] args) {
        // Valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Cálculo do faturamento total
        double faturamentoTotal = sp + rj + mg + es + outros;

        // Cálculo dos percentuais de representação por estado
        double percentualSP = (sp / faturamentoTotal) * 100;
        double percentualRJ = (rj / faturamentoTotal) * 100;
        double percentualMG = (mg / faturamentoTotal) * 100;
        double percentualES = (es / faturamentoTotal) * 100;
        double percentualOutros = (outros / faturamentoTotal) * 100;

        // Exibição dos resultados
        System.out.printf("Percentual de representação de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de representação de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de representação de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de representação de Outros: %.2f%%\n", percentualOutros);
    }
}
