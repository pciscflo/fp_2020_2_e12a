package com.upc.arreglos;

public class App1 {

    static int calcularCantidadAprobados(int notas[]) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 13) {
                contador++; //contador+=1
            }
        }
        return contador;
    }

    static double calcularPromedio(int notas[]) {
        double promedio = 0;
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        promedio = (suma * 1.0) / notas.length; //entero / entero = parte entera
        return promedio;
    }

    static String obtenerNombreMayorNota(int notas[], String nombres[]) {
        String nombreMayor = null;
        int maximo = 0;//menor valor posible
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maximo) {
                maximo = notas[i];//maximo=20
                nombreMayor = nombres[i];
            }
        }
        return nombreMayor + ":" + maximo;
    }

    public static void main(String[] args) {
        String nombres[] = {"Juan", "Luis", "Ana", "Rosa", "Peter", "Jorge"};
        int notas[] = {14, 18, 14, 20, 16, 12}; //tamaño del arreglo = 6, indices --> 0 a 5
        System.out.println(notas[0]);//20
        System.out.println(notas[5]);//12
        System.out.println("**********************"); //notas.length
        for (int i = 0; i < notas.length; i++) {//6
            System.out.println(notas[i]);//0,1,...5
        }
        System.out.println("***********************");
        for (int i = 0; i <= notas.length - 1; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("Promedio:" + calcularPromedio(notas));
        System.out.println("Nombre de mayor nota:" + obtenerNombreMayorNota(notas, nombres));
        int cantidad;
        cantidad = calcularCantidadAprobados(notas);
        System.out.println("Cantidad de Aprobados:" + cantidad);
    }
}
