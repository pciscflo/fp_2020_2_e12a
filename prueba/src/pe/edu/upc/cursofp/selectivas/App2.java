package pe.edu.upc.cursofp.selectivas;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        double resultado=0, sueldo=0;
        int ventas = 0;
        String tipo="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su sueldo:");
        sueldo = sc.nextDouble();
        System.out.print("Ingrese sus ventas:");
        ventas = sc.nextInt();
        System.out.print("Ingrese tipo:");
        tipo = sc.next();
        resultado = calcularSueldoFinal(sueldo,ventas,tipo);
        System.out.println("Sueldo final: "+ resultado);
    }
    static double calcularSueldoFinal(double sueldo, int ventas, String tipo){
        double sueldoFinal =0, bono=0;
        bono = calcularBono(ventas, tipo)*sueldo;
        sueldoFinal = bono + sueldo;
        return sueldoFinal;
    }
    static double calcularBono(int ventas,String tipo){
        double porcentaje=0;
        switch (tipo){
            case "A" : if (ventas>=0 && ventas<=1200){
                         porcentaje =0.10;
                        }else if (ventas>=1201 && ventas<=5000){
                         porcentaje = 0.20;
                         } else if (ventas>5000){
                         porcentaje =0.15;
                         }
                break;
            case "B" : if (ventas>=0 && ventas<=1200){
                            porcentaje =0.12;
                        }else if (ventas>=1201 && ventas<=5000){
                        porcentaje = 0.25;
                        } else if (ventas>5000){
                         porcentaje =0.30;
                        }
                break;
        }
       return porcentaje;
    }
}
