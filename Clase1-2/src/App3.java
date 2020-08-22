import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double peso;
        int edad;

        System.out.print("Introduzca su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Hola "+ nombre + " !!!");

        System.out.print("Ingrese su peso: ");
        peso = sc.nextDouble();
        System.out.println("Su peso es de "+ peso + " Kilos");

        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();
        System.out.printf("Hola %s. Su peso es de  %.2f kilos y su edad es de %d años",nombre,peso,edad);

    }

}
