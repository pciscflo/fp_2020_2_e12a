package com.upc;

public class App2 {
    public static void main(String[] args) {
        //no esta contemplado probar numeros iguales en este ejemplo cualEsMayor y quienEs mayor
        System.out.println(cualEsMayor(4,5));//b es mayor que a
        String r;
        r = cualEsMayor(4,5);//b es mayor que a
        System.out.println(r);
        //pruebo el metodo completo
        r = comoES(4,4);
        System.out.println(r);//Iguales
    }
    static String cualEsMayor(int a, int b){
        if (a>b) {
            return "a es mayor que b";
        }else {
            return "b es mayor que a";
        }
    }
    static String quienEsMayor(int a, int b){
        String mensaje;
        if (a>b){
            mensaje="a es mayor que b";
        } else {
            mensaje="b es mayor que a";
        }
        return mensaje;
    }
    static String comoES(int a, int b){
        String mensaje;
        if (a>b){
            mensaje="a es mayor que b";
        } else if (b>a) {
            mensaje="b es mayor que a";
        } else {
            mensaje="Iguales";
        }
        return mensaje;
    }
}
