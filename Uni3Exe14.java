import java.util.Scanner;

public class Uni3Exe14 {
    /*
     * Descreva um programa que a partir da distância percorrida e o do tempo gasto
     * por um motorista durante uma viagem de final de semana, calcule a velocidade
     * média e a quantidade de combustível gasto na viagem, sabendo que o automóvel
     * faz 12 km por litro.
     *
     * Análise: Ok
     * 
     * Descreva um programa que a partir da, por um motorista durante uma viagem de
     * final de semana,sabendo que o automóvel faz,gasto na viagem
     * 
     * 
     * Entrada: distância, tempo,12 km por litro.
     * 
     * Processos:
     * velocidade média = distância / tempo
     * quantidade de combustível consumida = distância / 12
     * 
     * Saída: Imprimir(velocidade média), Imprimir(quantidade de combustível
     * consumida)
     * 
     */
    public static void main(String[] args) {
        double distancia;
        double tempo;
        double velocidadeMedia;
        double qtdCombustivel;
        System.out.println("Informe a distância percorrida (km): ");
        Scanner teste = new Scanner(System.in);
        distancia = teste.nextDouble();
        System.out.println("Informe o tempo gasto (h): ");
        tempo = teste.nextDouble();
        velocidadeMedia = distancia / tempo;
        qtdCombustivel = distancia / 12;
        System.out.println(String.format("Velocidade média: %.2f km/h", velocidadeMedia));
        System.out.println(String.format("Quantidade de combustível consumido: %.2f L", qtdCombustivel));

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Distância: 180
         * Tempo: 2.0
         * Velocidade média: 90.00 km/h
         * Quantidade de combustível consumido: 25.00 L
         * _Caso 2_
         * Distância: 150.0
         * Tempo: 3.0
         * Velocidade média: 50.00 km/h
         * Quantidade de combustível consumido: 12.50 L
         */

    }

}
