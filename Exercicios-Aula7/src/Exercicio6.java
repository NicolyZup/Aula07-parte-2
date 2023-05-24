import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero para visualizar seu antecessor e sucessor:");
        double numeroInformado = entrada.nextDouble();

        double antecessor = numeroInformado - 1;
        double sucessor = numeroInformado +1;

        System.out.println("O antecessor do " + numeroInformado + " é: " +antecessor + " , e o sucessor é: " + sucessor +".");

    }
}
