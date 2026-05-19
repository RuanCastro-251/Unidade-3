import java.util.Scanner;

public class Uni3Exe11 {
    /*
     * Descreva um programa que dado uma temperatura em °C informe o seu valor em °F.
     * Fórmula: °F = °C * 1.8 + 32 ou °F = (9/5) °C + 32
     * 
     * Análise: Ok
     * * Descreva um programa que dado uma temperatura em.
     * 
     * Entrada: temperatura em °C
     * 
     * Processos:
     * fahrenheit = celsius *1.8 + 32
     * 
     * Saída: Imprimir(fahrenheit)
     * 
     */
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        System.out.println("Informe a temperatura em Celsius: ");
        Scanner teste = new Scanner(System.in);
        celsius = teste.nextDouble();
        fahrenheit = celsius *1.8 + 32;
        System.out.println(String.format("%.2f", fahrenheit));

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Temperatura em Celsius: 25.0
         * Temperatura em Fahrenheit: 77.00
         * _Caso 2_
         * Temperatura em Celsius: 30.0
         * Temperatura em Fahrenheit: 86.00
         */
    }
    
}
