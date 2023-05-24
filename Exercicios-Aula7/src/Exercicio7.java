import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora:");
        double salarioHora = entrada.nextDouble();

        System.out.println("Informe quantas horas foram trabalhadas:");
        double horasTrabalhadas = entrada.nextDouble();

        double salario = salarioHora * horasTrabalhadas;
        double impostoDeRenda = salario * 11/100;
        double inss = salario * 8/100;
        double sindicato = salario * 5/100;

        double salarioFinal = salario - impostoDeRenda - inss - sindicato;

        System.out.printf("Salário bruto: R$%.2f \r\n",salario);
        System.out.printf("Desconto imposto de renda: R$%.2f \r\n", impostoDeRenda);
        System.out.printf("Desconto inss: R$%.2f \r\n", inss);
        System.out.printf("Desconto sindicato: R$%.2f \r\n", sindicato);
        System.out.printf("Seu salário líquido este mês é R$%.2f \r\n", salarioFinal);

    }
}
