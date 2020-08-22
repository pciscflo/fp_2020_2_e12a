package com.upc;

public class App4 {
    public static void main(String[] args) {
       double resultado = 0;
       resultado = calcularTotal("Nacional","normal", 24500);
        System.out.println(resultado);
    }

    static double calcularBonificacion1(String tipo, int kilometros){
        double bonificacion = 0, porcentaje=0;
        switch (tipo){
            case "Nacional":
                if (kilometros<=10000){
                  porcentaje = 0.1061;
                } else if (kilometros>=10001 && kilometros<=16000){
                    porcentaje= 0.2052;
                } else if(kilometros>=16001 && kilometros<=18000) {
                    porcentaje= 0.3043;
                } else  {
                    porcentaje = 0.4011;
                }
                break;
            case "Internacional":
                if (kilometros<=25000){
                    porcentaje = 0.4534;
                } else if (kilometros>=25001 && kilometros<=30000){
                    porcentaje= 0.5525;
                } else if(kilometros>=30001 && kilometros<=45000) {
                    porcentaje= 0.6516;
                } else  {
                    porcentaje = 0.7513;
                }
            break;
        }

        return porcentaje*kilometros;
    }
    static double calcularBono2(String tipoCliente, int kilometros){
        double resultado =0, porcentaje=0;
        //aplicar switch case
        switch (tipoCliente){
            case "normal": porcentaje=0.10;
                    break;
            case "preferencial": porcentaje=0.12;
                    break;
            case "vip" : porcentaje=0.20;
                    break;
        }
        resultado = porcentaje*kilometros;
        return  resultado;
    }
    static double calcularTotal(String tipo, String tipoCliente, int kilonetros){
        double total =0;
        total = calcularBonificacion1(tipo, kilonetros) + calcularBono2(tipoCliente, kilonetros);
        return total;
    }
}
