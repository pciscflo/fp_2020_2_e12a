package com.upc.arreglos;

import java.util.Arrays;

public class App4 {
    static String[] platos = {"Lomo Saltado", "Aji de Gallina", "Papa Rellena", "Seco con Frijoles", "Pollo a la Brasa"};
    static int[] extrangeros= {10000, 5000, 200, 800, 60000};
    static int [] nacionales = {25000, 18600, 14400, 12000, 30000};

    public static void main(String[] args) {
        int [] totalxPlato = calcularTotalxPlato();
        System.out.println("Los totales de cada plato (Nacional + Extrangero) son:"+Arrays.toString(totalxPlato));
        System.out.println("Suma de Totales de cada Plato: " + sumaTotalexPlato());
        double [] porcentajes = obtenerPorcentajesTotalxPlato();
        System.out.println("Porcentajes Totales x Plato: " + Arrays.toString(porcentajes));

    }
    static double[] obtenerPorcentajesTotalxPlato(){
        int temporal[] = calcularTotalxPlato();
        int sumaTotales = sumaTotalexPlato();
        double porcentajeTotalxPlato [] = new double[extrangeros.length];
        for (int i=0; i< porcentajeTotalxPlato.length;i++){
            porcentajeTotalxPlato[i]= ((double)temporal[i] /sumaTotales)*100;
        }
        return porcentajeTotalxPlato;
    }
    static int sumaTotalexPlato(){
         int totalesxPlato[] = calcularTotalxPlato();
         int suma=0;
         for (int i=0; i< totalesxPlato.length;i++){
             suma+=totalesxPlato[i];
         }
         return suma;
    }
    static int[] calcularTotalxPlato(){
        int temporal[] = new int[extrangeros.length];
        for (int i=0; i<extrangeros.length; i++){
            temporal[i] = extrangeros[i] + nacionales[i];
        }
        return temporal;
    }
}
