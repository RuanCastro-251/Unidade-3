import java.util.Scanner;

public class Uni3Exe08 {

    /*
     * Enunciado:
     * / Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto
     *   ela entregou um valor em dólares para o atendente.
     * / Considerando que o atendente tem a cotação do dólar, descreva um programa
     *   para calcular quantos reais o atendente deve devolver.
     * 
     * Análise: Ok
     * 
     * Uma pessoa foi até uma casa de câmbio trocar dólares por reais,descreva um programa
     * 
     * Entrada: 
     * -cotação do dólar,valor em dolares
     * 
     * Processos:
     * -valorEmReais = valorEmDolar*cotacaoDolar;
     * 
     * Saída:
     * -Imprimir(valorEmReais) */


    public static void main(String[] args) {
        double cotacaoDolar;
        double valorEmDolar;
        System.out.println("Informe a cotação em Dolar: ");
        Scanner teste=new Scanner(System.in);
        cotacaoDolar=teste.nextDouble();
        System.out.println("Informe o valor em Dolar: ");
        valorEmDolar=teste.nextDouble();
        double valorEmReais=valorEmDolar*cotacaoDolar;
        System.out.println("O valor em reais seria: R$"+valorEmReais);

        teste.close();

        /*Valor de teste
        _Caso 1_
        Cotação: 5.00
        Valor em Dólar: 100.00
        Valor em Reais: 500.00
        _Caso 2_
        Cotação: 4.50
        Valor em Dólar: 200.00
        Valor em Reais: 900.00
         */
        

    
    }
}
