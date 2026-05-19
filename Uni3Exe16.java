import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        /*
         * Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
         * Considerando que alguém está pagando uma compra, faça um programa que
         * determine e escreva o número mínimo de notas que o caixa deve fornecer como
         * troco. Escreva também o número de cada tipo de nota a ser fornecido como
         * troco. Suponha que o sistema monetário não utilize centavos.
         * 
         * Análise: Ok
         * 
         * Descreva um programa que a partir do, considerando que alguém está pagando
         * uma compra, faça um programa que,que o caixa deve fornecer
         * 
         * Entrada:
         * valor da compra, valor pago
         * 
         * Processos:
         * troco = valor pago - valor da compra
         * qtdNotas100 = troco / 100
         * resto100 = troco % 100
         * qtdNotas10 = resto100 / 10
         * resto10 = resto100 % 10
         * qtdNotas1 = resto10 / 1
         * 
         * Saída:
         * Imprimir número mínimo de notas, número de cada tipo de nota
         */
        int valorNota100 = 100;
        int valorNota10 = 10;
        int valorNota1 = 1;
        int valorCompra;
        int valorPago;
        System.out.println("Informe o valor da compra: ");
        Scanner teste = new Scanner(System.in);
        valorCompra = teste.nextInt();
        System.out.println("Informe o valor pago: ");
        valorPago = teste.nextInt();
        int troco = valorPago - valorCompra;
        int qtdNotas100 = (troco / valorNota100);
        int resto100 = troco % valorNota100;
        int qtdNotas10 = resto100 / valorNota10;
        int resto10 = resto100 % valorNota10;
        int qtdNotas1 = resto10 / valorNota1;
        System.out.println("Número de notas de 100: " + qtdNotas100);
        System.out.println("Número de notas de 10: " + qtdNotas10);
        System.out.println("Número de notas de 1: " + qtdNotas1);

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Valor da compra: 250
         * Valor pago: 300
         * Número de notas de 100: 0
         * Número de notas de 10: 5
         * Número de notas de 1: 0
         * _Caso 2_
         * Valor da compra: 75
         * Valor pago: 200
         * Número de notas de 100: 1
         * Número de notas de 10: 2
         * Número de notas de 1: 5
         */
    }
}
