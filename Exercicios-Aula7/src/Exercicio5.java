import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit:");
        double temperaturaFahrenheit = entrada.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32)* 5/9;

        System.out.printf(temperaturaFahrenheit +"° Fahrenheit equivale a %.2f° Celsius" ,temperaturaCelsius);
    }
}
