import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua primera nota bimestral:");
        double primeiraNota = entrada.nextDouble();

        System.out.println("Informe sua segunda nota bimestral:");
        double segundaNota = entrada.nextDouble();

        System.out.println("Informe sua terceira nota bimestral:");
        double terceiraNota = entrada.nextDouble();

        System.out.println("Informe sua quarta nota bimestral:");
        double quartaNota = entrada.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.printf("Sua média aritmética é %.1f.", media);
    }
}
