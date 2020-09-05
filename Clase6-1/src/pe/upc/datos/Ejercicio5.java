package pe.upc.datos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importe;
        int numero;

        System.out.println("Ingresar el importe de la compra: ");
        importe = sc.nextDouble();

        System.out.println("Ingresar el número: ");
        numero = sc.nextInt();

        //Para probar método calculaDescuento
        double descuento = calculaDescuento(importe,numero);
        System.out.printf("El porcentaje de descuento es: %.2f\n", descuento);

        //Para probar método importeAPagar
        double importePago = importeAPagar(importe,numero);
        System.out.printf("El porcentaje de descuento es: %.2f\n", importePago);
    }

    static double calculaDescuento(double importe, int numero){
        int contador = 0;
        double descuento = 0.0;
        if (importe > 800){
            while (numero>0){
                if (numero%10 == 1){
                    contador +=1;
                }
                numero /= 10;
            }
            descuento = importe * contador*1.0/100;
            if (contador%2==0 && contador>0){
                descuento += 50;
            }
        }else{
            descuento = 0.0;
        }
        return descuento;
    }

    static double importeAPagar(double importe, int numero){
        double descuento = calculaDescuento(importe,numero);
        double importePago = importe-descuento;
        return importePago;
    }
}
