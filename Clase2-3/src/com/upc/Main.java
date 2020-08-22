package com.upc;

public class Main {

    public static void main(String[] args) {
	// como nuestra pantalla, vista, front
        int s;
        s = suma(4,5);
        System.out.println(s);
        System.out.println(suma(6,4));
        s = sumita(7,7);
        System.out.println(s);
        sumaproceso(20,20);

    }
    static int suma(int a, int b){
        return (a + b);
    }
    static int sumita(int a, int b){
        int suma;
        suma = a + b;
        return suma;
    }
    static void sumaproceso(int a, int b){ //menos deseable
        int suma;
        suma = a + b;
        System.out.println(suma);
    }

}
