package com.pe.upc;

public class App0 {
    public static void main(String[] args) {
        String nombre = "Felipe";
        //substring(posicion, (longitud desde la posicion = valor2 - posicion))
        System.out.println(nombre.substring(0,1));// 0,1
        System.out.println(nombre.substring(3,6)); // 3, (6-3)  ipe
        System.out.println(nombre.substring(2,5));  // 2,3  lip
        System.out.println(nombre.substring(3,5));  //3,2 ip
        String codigo = "F2020AA12";
        System.out.println("Año de ese codigo:" + codigo.substring(1,5));//1,4
        System.out.println("Placa del Vehiculo:" + codigo.substring(5,9));//5,4

    }
}
