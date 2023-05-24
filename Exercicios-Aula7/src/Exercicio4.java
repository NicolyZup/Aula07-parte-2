import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora:");
        double salarioHora = entrada.nextDouble();

        System.out.println("Informe quantas horas foram trabalhadas:");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioFinal = salarioHora * horasTrabalhadas;

        System.out.printf("Seu sálario este mês é R$%.2f.", salarioFinal);
    }
}
