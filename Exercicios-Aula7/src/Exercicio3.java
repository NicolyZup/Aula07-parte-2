import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número de metros a ser convertidos para centímetros:");
        double metrosInformados = entrada.nextDouble();

        double centimetros = metrosInformados * 100;

        System.out.println(metrosInformados + " metros equivalem a " + centimetros + " centímetros.");
    }
}
