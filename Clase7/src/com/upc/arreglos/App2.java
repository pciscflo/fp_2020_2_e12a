package com.upc.arreglos;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        int ventas[] ={29, 4, 7 ,10, 3};
        String agentes [] = {"Jose", "Carlos", "Lorenzo", "Maria", "Carmen"};
        System.out.println("Total de Ventas:" + calcularTotalVentas(ventas));
        System.out.println("% de Agentes que superaon la cuota:" + calcularPorcentajeAgentesCuotaOk(ventas) );
        String [] vendeSup = obtenerNombresSuperaronCuota(ventas,agentes);
        System.out.println("Superaron cuota:" + Arrays.toString(vendeSup));

    }
    static int calcularTotalVentas(int ventas[]){
        int suma =0;
        for (int i=0; i < ventas.length ; i++){
            suma+=ventas[i];
        }
        return suma;
    }

    static double calcularPorcentajeAgentesCuotaOk(int ventas[]){
        int cantidadCuotas=0;
        for (int i=0; i < ventas.length ; i++){
            if (ventas[i]>=5){
                cantidadCuotas++;
            }
        }
        return (double)cantidadCuotas/ventas.length;
    }
    static String[] obtenerNombresSuperaronCuota(int ventas[], String agentes[] ){
         String tempo[] = new String[agentes.length]; //declarando un arreglo de 5 elementos
         int contador = 0;
         for(int i=0 ; i<ventas.length;i++){
             if (ventas[i] > 5){
                 tempo[contador] = agentes[i];
                 contador++;
             }
         }
         return tempo;//si son menos de 5 entonces tempo tendrá valores nulos { "Jose"  , "Lorenzo"   , "Maria"  , null  ,  null }
    }
}
