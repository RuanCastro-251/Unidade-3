import java.util.Scanner;

public class Uni3Exe05 {

    /*
     * Uma granja possui um controle automatizado de cada frango da sua produção. No
     * pé direito do frango há um anel com um chip de identificação; no pé esquerdo
     * são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo
     * que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um
     * programa para calcular o gasto total da granja para marcar todos os seus
     * frangos.
     * 
     * Análise: Ok
     * 
     * Uma granja possui um controle automatizado de cada frango da sua produção. No
     * pé direito do frango há um anel com ; no pé esquerdo
     * são que ele deve consumir. Sabendo
     * que o anel com e o , faça um
     * programa para calcular o da granja para marcar todos os seus
     * frangos.
     * 
     * Entrada: quantidade de frangos, valor do chip de identificação, valor do chip de alimento
     * 
     * Processos:
     * valor do chip de alimento total = valor do chip de alimento * 2
     * valor total por frango = valor do chip de identificação + valor do chip de alimento total
     * gasto total = quantidade de frangos * valor total por frango
     * 
     * Saída: O gasto total para marcar os Frangos sera de: R$ gasto total
     * 
     */
    public static void main(String[] args) {
        int numeroFrango;
        double valorChips;
        double valorChipsAlimento;
        Scanner teste = new Scanner(System.in);
        System.out.println("Quantidade de Frangos: ");
        numeroFrango = teste.nextInt();
        System.out.println("Digite o valor dos Chips de identificação(UN): ");
        valorChips = teste.nextDouble();
        System.out.println("Digite o valor dos Chips de Alimento(UN): ");
        valorChipsAlimento = teste.nextDouble();
        double chips = valorChipsAlimento * 2;

        double valorChipsTotais = valorChips + chips;
        double gastoTotal = numeroFrango * valorChipsTotais;
        System.out.println("O gasto total para marcar os Frangos sera de: " + gastoTotal);

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Quantidade de Frangos: 100
         * Valor dos Chips de identificação(UN): 4.00
         * Valor dos Chips de Alimento(UN): 3.50
         * O gasto total para marcar os Frangos sera de: R$ 1050.00
         * _Caso 2_
         * Quantidade de Frangos: 150
         * Valor dos Chips de identificação(UN): 4.00
         * Valor dos Chips de Alimento(UN): 3.50
         * O gasto total para marcar os Frangos sera de: R$ 1575.00
         */

    }

}
