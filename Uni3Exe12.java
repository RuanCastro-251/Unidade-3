import java.util.Scanner;

public class Uni3Exe12 {
    /*
     * Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes.
     * A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família)
     * e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda.
     * Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
     * 
     * Análise: Ok
     * Uma empresa tem para um funcionário os seguintes dados:,valor para cálculo do salário trabalho),(valor para cálculo do salário família),
     * sobre o salário trabalho para o INSS,sobre o salário trabalho para o imposto de renda.
     *
     *   Entrada: nome do funcionário, quantidade de horas trabalhadas, número de dependentes,valorDependente,valorHoraTrabalhada,Desconto INSS,Desconto IR
     * 
     *   Processos:
     * salarioBruto = (valorHoraTrabalhada * qtdHorasTrabalhadas) + (valorDependente * numeroDependentes)
     * salarioLiquido = salarioBruto * taxa
     * salarioLiquido2 = salarioBruto - salarioLiquido
     * 
     *   Saída: 
     * Imprimir(nomeFuncionario, salarioBruto, salarioLiquido2)
     */
    public static void main(String[] args) {
        double qtdHorasTrabalhadas;
        String nomeFuncionario;
        double numeroDependentes;
        double valorHoraTrabalhada=10;
        double valorDependente=60;
        double taxa=0.135;

        System.out.println("Informe o nome do funcionário: ");
        Scanner teste = new Scanner(System.in);
        nomeFuncionario = teste.nextLine();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        qtdHorasTrabalhadas = teste.nextDouble();
        System.out.println("Informe o número de dependentes: ");
        numeroDependentes = teste.nextDouble();
        double salarioBruto=(valorHoraTrabalhada*qtdHorasTrabalhadas)+(valorDependente*numeroDependentes);
        double salarioLiquido=salarioBruto*taxa;
        double salarioLiquido2=salarioBruto-salarioLiquido;
        System.out.println("O funcionário " +nomeFuncionario+" possui um salário bruto de R$"+salarioBruto+" e um salário líquido de R$"+salarioLiquido2);

        teste.close();

        /*
         * Valor de teste
         * _Caso 1_
         * Nome do funcionário: Maria
         * Quantidade de horas trabalhadas: 154.0
         * Número de dependentes: 1.0
         * Salário bruto: R$ 1960.00
         * Salário líquido: R$ 1702.40
         * _Caso 2_
         * Nome do funcionário: Pedro
         * Quantidade de horas trabalhadas: 500.0
         * Número de dependentes: 5.0
         * Salário bruto: R$ 3000.00
         * Salário líquido: R$ 2595.00
         */


    
}
}
