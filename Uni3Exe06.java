import java.util.Scanner;

public class Uni3Exe06 {
    /*
     * Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa
     * que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a
     * pagar. O peso do prato é de 750 gramas.
     * 
     * Análise: Ok
     * 
     * Um restaurante cobra , de refeição. Escreva um programa
     * que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a
     * pagar.
     * 
     * 
     * Entrada: peso do prato montado pelo cliente (em quilos)
     * 
     * Processos:
     * valor do quilo = 25.00
     * peso do prato = 0.750 kg
     * peso do prato montado pelo cliente = peso do alimento - peso do prato
     * valor a pagar = peso do prato montado pelo cliente * valor do quilo
     * 
     * Saída: O valor do prato do cliente é: R$ valor a pagar
     */

    public static void main(String[] args) {
        double valorQuilo = 25;
        double pesoPrato1 = 0.750;
        double pesoQuilo;
        Scanner teste = new Scanner(System.in);
        System.out.println("Digite o peso do prato : ");
        pesoQuilo = teste.nextDouble();
        double pesoPrato2 = pesoQuilo - pesoPrato1;

        double precoFinal = pesoPrato2 * valorQuilo;
        System.out.println("O valor do prato do cliente é:" + precoFinal);

        teste.close();
        /*
         * Valor de teste
         * _Caso 1_
         * Peso do prato: 1.000 kg
         * O valor do prato do cliente é: R$ 6.25
         * _Caso 2_
         * Peso do prato: 1.500 kg
         * O valor do prato do cliente é: R$ 18.75
         */

    }

}
