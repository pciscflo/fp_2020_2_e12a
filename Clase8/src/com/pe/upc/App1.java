package com.pe.upc;

public class App1 {
    static String [] codigos = {"AR000101","PE125610","CH452315","BR521317","BR123620","PE752124","AR124511","PE562405",
                                "PE562405","BR452102","AR455210"};
    public static void main(String[] args) {
        System.out.println("Cantidad de Productos del pais PE:" + obtenerCantidadProductos("PE"));
        System.out.println("Ultimo Correlativo de PE:"+ obtenerUltimoCorrelativo("PE"));
        System.out.println("Costo Total de Almacenaje de PE:" + obtenerCostoTotalAlmacenamiento("PE"));
    }
    static int obtenerCantidadProductos(String nacionalidad){
        int cantidad=0;
        for (int i=0; i<codigos.length;i++){
            if (codigos[i].substring(0,2).equals(nacionalidad)){
                cantidad++;//cantidad+=1 es lo mismo
            }
        }
        return cantidad;
    }
    static int obtenerUltimoCorrelativo(String nacionalidad){ //Integer.parseInt(cadena) convierte la cadena a entero
        int maximo=0;
        for (int i=0; i<codigos.length;i++){
            if (codigos[i].substring(0,2).equals(nacionalidad) && Integer.parseInt(codigos[i].substring(2,6)) >maximo){
               maximo = Integer.parseInt(codigos[i].substring(2,6));
            }
        }
        return maximo;
    }
    static int obtenerCostoTotalAlmacenamiento(String nacionalidad){
        int suma=0;
        for (int i=0; i<codigos.length;i++){
            if (codigos[i].substring(0,2).equals(nacionalidad)){
                suma += Integer.parseInt(codigos[i].substring(6,8));
            }
        }
        return suma;
    }

}
