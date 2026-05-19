import java.util.Scanner;

public class Uni3Exe02 {
    /*
     * 
     * __ Enunciado:
     * Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um
     * programa para calcular e exibir o valor de desconto a ser dado num par de
     * sapatos e quanto deve custar o produto com o desconto. O preço do par de
     * sapatos
     * deve ser informado pelo usuário. Como resultado, o programa deverá exibir as
     * seguintes mensagens:
     * 
     * O valor do desconto é de R$ xxx O preço do par de sapatos com desconto é R$
     * xxx
     * 
     * __ Análise: OK
     * 
     * Uma loja de calçados está concedendo Escreva um programa para calcular e
     * exibir
     * o
     * 
     * //__ Entradas:
     * 
     * preço do par de sapatos
     * 
     * //__ Processos:
     * 
     * 12% de desconto
     * 
     * precoSapato valorDesconto precoSapatoDesconto
     * 
     * //__ Saídas:
     * 
     * O valor do desconto é de R$ xxx O preço do par de sapatos com desconto é R$
     * xxx
     * 
     */
    public static void main(String[] args) {
        double valorSapato;
        double valorDesconto = 0.12;
        Scanner teste = new Scanner(System.in);
        System.out.println("Digite o valor do sapato: ");
        valorSapato = teste.nextDouble();
        double valorDoDesconto = valorDesconto * valorSapato;

        System.out.println("O valor do sapato com desconto fica: " + valorDoDesconto + "%");
        double precosapato = valorSapato - valorDoDesconto;
        System.out.println("O preço do par de sapatos com desconto é: R$" + precosapato);

        teste.close();

        /*
         * __ Valores de Testes:
         * _ Caso 1 ___
         * sapatoPreco = 200,00
         * desconto = 0.12
         * sapatoDesconto = 24.0
         * sapatoPrecoDesconto = 176.0
         * 
         * _ Caso 2 ___
         * sapatoPreco = 123,45
         * desconto = 0.12
         * sapatoDesconto = 14.814
         * sapatoPrecoDesconto = 108.636
         * 
         */

    }
}
