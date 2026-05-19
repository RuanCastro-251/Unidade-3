import java.util.Scanner;

public class Uni3Exe03 {

    /*
     * Um motorista deseja abastecer seu tanque de combustível. Escreva um programa
     * para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos
     * litros ele conseguiu colocar no tanque.
     * 
     * Análise: Ok
     * 
     * Um motorista deseja abastecer seu tanque de combustível. Escreva um programa
     * para ler o, da gasolina e o , e exibir , ele conseguiu colocar no tanque.
     * 
     * Entrada: preço do litro da gasolina, valor do pagamento
     * 
     * Processos:
     * litros = valor do pagamento / preço do litro da gasolina
     * 
     * Saída: exibir quantos litros ele conseguiu colocar no tanque
     * 
     * 
     */
    public static void main(String[] args) {
        double precoGasolina;
        double valorPagamento;
        Scanner teste = new Scanner(System.in);
        System.out.println("Digite o valor do litro da gasolina: ");
        precoGasolina = teste.nextDouble();
        System.out.println("Digite o valor do abastecimento");
        valorPagamento = teste.nextDouble();
        double valorCobrar = valorPagamento / precoGasolina;
        System.out.printf("O motorista conseguiu colocar: " + "%.2f" + " litros", valorCobrar);
        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Preço do litro da gasolina: 5.50
         * Valor do pagamento: 110.00
         * O motorista conseguiu colocar: 20.00 litros
         * _Caso 2_
         * Preço do litro da gasolina: 4.80
         * Valor do pagamento: 96.00
         * O motorista conseguiu colocar: 20.00 litros
         */

    }

}
