package com.upc;

public class App1 {
    public static void main(String[] args) {
       String m;
        m = queEs(10);
        System.out.println(m);//Positivo
        m = queEs(0);
        System.out.println(m);//Cero
        m = esUnNumero(-2);
        System.out.println(m); //Negativo

    }
    static String queEs(int n){
        if (n>0){
            return "Positivo";
        } else if (n<0){
            return "Negativo";
        }else {
            return "Cero";
        }
    }

    static String esUnNumero(int n){
        String mensaje;
        if (n>0){
            mensaje="Positivo";
        }else if (n<0){
            mensaje="Negativo";
        }else {
            mensaje="Cero";
        }
        return mensaje;
    }
}
