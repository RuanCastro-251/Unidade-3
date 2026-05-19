import java.util.Scanner;

public class Uni3Exe10 {
    /*
     * Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
     * Fórmula: hipotenusa = raiz quadrada (cateto oposto^2 + cateto adjacente^2)
     * 
     * Análise: Ok
     * 
     * Descreva um programa que leia o comprimento dos
     * 
     * Entrada: cateto oposto, cateto adjacente
     * 
     * Processos:
     * hipotenusa = raiz quadrada (cateto oposto^2 + cateto adjacente^2)
     * 
     * Saída: Imprimir(hipotenusa)
     * 
     */
    public static void main(String[] args) {
        double catetoOposto;
        double catetoAdjacente;
        System.out.println("Informe o valor do cateto oposto: ");
        Scanner teste= new Scanner(System.in);
        catetoOposto = teste.nextDouble();
        System.out.println("Informe o valor do cateto adjacente: ");
        catetoAdjacente = teste.nextDouble();
        double hipotenusa = Math.sqrt((catetoOposto * catetoOposto) + (catetoAdjacente * catetoAdjacente));
        System.out.println(String.format("%.2f", hipotenusa));

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Cateto Oposto: 19.0
         * Cateto Adjacente: 2.0
         * Hipotenusa: 19.10
         * _Caso 2_
         * Cateto Oposto: 7.0
         * Cateto Adjacente: 15.0
         * Hipotenusa: 16.55
         */
    }
    
}
