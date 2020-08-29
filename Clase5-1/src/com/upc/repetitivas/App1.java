package com.upc.repetitivas;

public class App1 {
    public static void main(String[] args) {
        int s = 0;
        s = sumarNumerosNaturales(3);
        System.out.println(s);
    }
     static int sumarNumerosNaturales(int n){ //1+2.....n --->i
        int suma = 0;
        for(int i=1; i<=n ;i++){ //i++;   es lo mismo que ++i;  en cambio p=++i; es diferente que p=i++
            suma+=i;//1+2+3   suma+=i  es lo mismo que suma = suma + i (suma es acumulador acumula los valores de i)
        }
        return suma;
     }
}