package pe.upc.datos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave;

        System.out.println("Ingresar la clave: ");
        clave = sc.nextInt();

        //Para probar método cantidadDigitos
        int digitos = cantidadDigitos(clave);
        System.out.println("La cantidad de dígitos que tiene la clave es: " + digitos);

        //Para probar método cantidadDigitos
        int suma = sumadosDigitos(clave);
        System.out.println("La suma de los digitos de la posición 3 y 4 es: " + suma);

        //Para probar método evaluaClave
        String mensaje = evaluaClave(clave);
        System.out.printf("El resultado de la clave es: %s.\n", mensaje);
    }

    static int cantidadDigitos(int clave){
        int contador = 0;
        while (clave > 0){
            contador += 1; //contador = contador +1
            clave /= 10; //numero = numero /10
        }
        return contador;
    }

    static int sumadosDigitos(int clave){
        int posicion = 0;
        int suma = 0;
        while (clave > 0){
            posicion +=1; //posicion = posicion +1
            if (posicion == 3 || posicion == 4){
                suma = suma + clave%10;
            }
            clave /= 10; //numero = numero /10
        }
        return suma;
    }

    static String evaluaClave(int clave){
        String resultado = "";
        int digitos = cantidadDigitos(clave);
        int suma = sumadosDigitos(clave);

        if (digitos >= 4 && suma%2 == 0){
           resultado = "Cumple";
        }else {
            resultado = "No cumple";
        }
        return resultado;
    }
}
