import java.util.Scanner;

public class Uni3Exe01 {
    /*
     * Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler
     * as dimensões de um terreno e depois exibir a área do terreno.
     * Fórmula: área = comprimento * largura
     * 
     * Análise: Ok
     * 
     * Descreva um programa que leia o , de um terreno,retangular e.
     * 
     * Entrada: comprimento, largura
     * 
     * Processos:
     * área = comprimento * largura
     * 
     * Saída: Imprimir(área)
     * 
     */
    public static void main(String[] args) {
        int comprimento = 10;
        int largura = 5;
        Scanner teste = new Scanner(System.in);
        System.out.println("Digite o comprimento do retângulo: ");
        comprimento = teste.nextInt();
        System.out.println("Digite a largura do retângulo: ");
        largura = teste.nextInt();
        System.out.println("Área do terreno : " + (comprimento * largura));

        teste.close();
        /*
         * Valor de teste
         * _Caso 1_
         * Comprimento: 10
         * Largura: 5
         * Área do terreno : 50
         * _Caso 2_
         * Comprimento: 15
         * Largura: 8
         * Área do terreno : 120
         */
    }
}