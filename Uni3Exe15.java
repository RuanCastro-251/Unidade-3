import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        /*
         * Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
            * Centenas: x
            * Dezenas: y
            * Unidades: z
            * 
            * Análise: Ok
             * 
             * Descreva um programa para ler um
             * 
             * Entrada: número inteiro (até 3 dígitos)
             * 
             * Processos:
             * centenas = numero / 100
             * restoCentenas = numero % 100
             * dezenas = restoCentenas / 10
             * unidades = restoCentenas % 10
             * 
             * Saída: Imprimir centenas, dezenas e unidades
            * 
         */

        int numero;
        System.out.println("Informe um número inteiro (até 3 dígitos): ");
        Scanner teste = new Scanner (System.in);
        numero = teste.nextInt();
        int centenas =numero / 100;
        int restoCentenas =numero % 100;
        int dezenas = restoCentenas / 10;
        int unidades = restoCentenas % 10;
        System.out.println("Centenas: " + centenas);
        System.out.println("Dezenas: " + dezenas);
        System.out.println("Unidades: " + unidades);
        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Número: 123
         * Centenas: 1
         * Dezenas: 2
         * Unidades: 3
         * _Caso 2_
         * Número: 45
         * Centenas: 0
         * Dezenas: 4
         * Unidades: 5
         */
    }

}
