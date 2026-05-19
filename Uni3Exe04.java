import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {

        /*
         * Faça um programa para ler três notas de um aluno em uma disciplina e
         * imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
         * 
         * Análise: Ok
         * 
         * Descreva um programa para ler, de um aluno em uma disciplina e
         * imprimir a sua, (as notas tem pesos respectivos de ).
         * 
         * Entrada:
         * nota1, nota2, nota3
         * Processos:
         * somaPeso = peso1 + peso2 + peso3
         * mediaPonderada = (peso1 * nota1 + peso2 * nota2 + peso3 * nota3) / somaPeso
         * 
         * Saída:
         * A sua média finaliza em : mediaPonderada
         * 
         * 
         * 
         * 
         */
        double nota1;
        double nota2;
        double nota3;
        double peso1 = 5;
        double peso2 = 3;
        double peso3 = 2;

        Scanner teste = new Scanner(System.in);
        System.out.println("Inclua sua 1º Nota: ");
        nota1 = teste.nextDouble();
        System.out.println("Inclua sua 2º Nota: ");
        nota2 = teste.nextDouble();
        System.out.println("Inclua sua 3º Nota: ");
        nota3 = teste.nextDouble();
        double somaPeso = peso1 + peso2 + peso3;
        double mediaPonderada = (peso1 * nota1 + peso2 * nota2 + peso3 * nota3) / somaPeso;
        System.out.println("A sua média finaliza em :" + mediaPonderada);

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Nota 1: 7.0
         * Nota 2: 8.0
         * Nota 3: 9.0
         * A sua média finaliza em : 7.90
         * _Caso 2_
         * Nota 1: 6.5
         * Nota 2: 7.5
         * Nota 3: 8.0
         * A sua média finaliza em : 7.25
         */
    }
}
