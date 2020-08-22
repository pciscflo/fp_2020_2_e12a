import java.util.Scanner;

public class App7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        System.out.print("Introduzca grados Celsius: ");
        celsius = sc.nextDouble();

        double farenheit;
        farenheit = 1.8*celsius + 32;

        System.out.printf("Grados Celsius convertido a Farenheit es: %.2f",farenheit);
    }
}
