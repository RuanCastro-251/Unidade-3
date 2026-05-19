import java.util.Scanner;

public class Uni3Exe07 {
    /*
     * Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350
     * ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma
     * determinada quantidade de cada formato, faça um programa para calcular
     * quantos litros de refrigerante ele comprou.
     * 
     * Análise: Ok
     * 
     * Uma fábrica de refrigerantes vende seu produto em três formatos: . Se um
     * comerciante compra uma
     * de cada formato, faça um programa para calcular
     * 
     * Entrada: quantidade de cada formato
     * 
     * Processos:
     * lata de 350 ml = 0.350 litros
     * garrafa de 600 ml = 0.600 litros
     * garrafa de 2 litros = 2 litros
     * latasCompradas = (qtdLata350 * lataPequena) + (qtdLata600 * lataMedia) +
     * (qtdLata2L * lataGrande)
     * 
     * Saída: O cliente comprou ao tota: latasCompradas
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        int qtdLata350;
        int qtdLata600;
        int qtdLata2L;

        double lataPequena = 0.350;
        double lataMedia = 0.600;
        double lataGrande = 2;
        Scanner teste = new Scanner(System.in);
        System.out.println("Digite a quantidade de Latas de 350ml foram compradas: ");
        qtdLata350 = teste.nextInt();
        System.out.println("Digite a quantidade de Garrafas de 600ml foram compradas: ");
        qtdLata600 = teste.nextInt();
        System.out.println("Digite a quantitade de Garrafas de 2lt foram compradas: ");
        qtdLata2L = teste.nextInt();

        double latasCompradas = (qtdLata350 * lataPequena) + (qtdLata600 * lataMedia) + (qtdLata2L * lataGrande);
        System.out.println("O cliente comprou ao tota: " + latasCompradas);

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Quantidade de Latas de 350ml foram compradas: 10
         * Quantidade de Garrafas de 600ml foram compradas: 5
         * Quantitade de Garrafas de 2lt foram compradas: 2
         * O cliente comprou ao tota: 7.5 litros
         * _Caso 2_
         * Quantidade de Latas de 350ml foram compradas: 20
         * Quantidade de Garrafas de 600ml foram compradas: 10
         * Quantitade de Garrafas de 2lt foram compradas: 5
         * O cliente comprou ao tota: 17 litros
         */

    }
}
