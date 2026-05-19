import java.util.Scanner;

public class Uni3Exe13 {
    /* 
     * Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50.
     * Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. 
     * Considere que um metro quadrado é formado por 9 azulejos.
     * 
     *   Entrada: comprimento da parede, altura da parede,
     * 
     * Numa loja de materiais de construção,Faça um programa para ler
     * 
     *   Processos:
     *   area = comprimento * altura
     *   valorGasto = area * azulejo * 9
     * 
     *   Saída: valor gasto com azulejos
     */
    public static void main(String[] args) {
        double azulejo=12.50;
        double comprimento;
        double altura;
        double valorGasto;
        System.out.println("Informe o comprimento da parede: ");
        Scanner teste = new Scanner(System.in);
        comprimento = teste.nextDouble();
        System.out.println("Informe a altura da parede: ");
        altura = teste.nextDouble();
        double area=comprimento*altura;
        valorGasto=area*azulejo*9;
        System.out.println("O valor gasto com azulejos é: R$ " + valorGasto);
        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Comprimento: 5.0
         * Altura: 3.0
         * Valor gasto com azulejos: R$ 1687.50
         * _Caso 2_
         * Comprimento: 10.0    
         * Altura: 4.0
         * Valor gasto com azulejos: R$ 4500.00
         */
    }
    
}
