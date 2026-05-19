import java.util.Scanner;

public class Uni3Exe09 {
    /*
     * Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
     * Volume = pi * raio^2 * altura
     * 
     * Análise: Ok
     * 
     * Entrada: raio, altura
     * 
     * Processos:
     * volume = valorPi * (raio*raio) * altura
     * 
     * Saída: Imprimir(volume)
     * 
     */
    public static void main(String[] args) {
        double valorPi = 3.141592653589793;
        double raio;
        double altura;
        System.out.println("Informe o valor do raio: ");
        Scanner teste = new Scanner(System.in);
        raio = teste.nextDouble();
        System.out.println("Informe o valor da altura: ");
        altura = teste.nextDouble();
        double volume = valorPi * (raio * raio) * altura;
        System.out.println(String.format("%.2f", volume));

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Raio: 12.5
         * Altura: 20.0
         * Volume: 981.75
         * _Caso 2_
         * Raio: 5.0
         * Altura: 10.0
         * Volume: 785.40
         */

    }
}
