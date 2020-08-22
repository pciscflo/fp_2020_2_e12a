package com.upc;

public class App3 {
    //parametros de entrada tiempo, venta
    public static void main(String[] args) {
        double resultado;
        resultado = calcularComision(10, 8000);
        System.out.println(resultado);

    }
    static double calcularComision(int tiempo, int venta){
        double comision=0, porcentaje=0;
        if (tiempo>=1 && tiempo<=4){
            if(venta>=1000 && venta<=2500){
                porcentaje = 0.02;
            }else if (venta>=2501 && venta<=5000){
                porcentaje = 0.03;
            }else if (venta>=5001 && venta<=10000){
                porcentaje = 0.04;
            }else{
                porcentaje= 0.05;
            }
        }else if (tiempo>=5 && tiempo<=10){
            if(venta>=1000 && venta<=2500){
                porcentaje = 0.025;
            }else if (venta>=2501 && venta<=5000){
                porcentaje = 0.035;
            }else if (venta>=5001 && venta<=10000){
                porcentaje = 0.045;
            }else{
                porcentaje= 0.055;
            }

        }else if (tiempo>=11 && tiempo<=15){
            if(venta>=1000 && venta<=2500){
                porcentaje = 0.03;
            }else if (venta>=2501 && venta<=5000){
                porcentaje = 0.04;
            }else if (venta>=5001 && venta<=10000){
                porcentaje = 0.05;
            }else{
                porcentaje= 0.06;
            }
        }else{
            if(venta>=1000 && venta<=2500){
                porcentaje = 0.05;
            }else if (venta>=2501 && venta<=5000){
                porcentaje = 0.06;
            }else if (venta>=5001 && venta<=10000){
                porcentaje = 0.08;
            }else{
                porcentaje= 0.08;
            }
        }
        comision = porcentaje*venta;
        return comision;
    }

}
