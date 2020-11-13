package pe.upc.datos;

import java.util.Scanner;

public class App3 {
	/*
	  Calcular el Factorial del un número n
	*/
    public static void main(String[] args) {
        int fact;
        fact = factorial(12);
        System.out.println(fact);
        int funcion,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa x:");
        x = sc.nextInt();
        funcion = factorial(x) + factorial(x+1);
        System.out.println("Funcion:" + funcion);
    }
    static int factorial(int n){ // 1x2x3....xn = n!
        int f=1;
        for(int i=1; i<=n; i++){//i=2,3,....,n
            f = f * i;//1x2x3x   n
        }
        return f;
    }
}
