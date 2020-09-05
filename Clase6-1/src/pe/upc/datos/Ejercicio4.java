package pe.upc.datos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m3;
        String tipo;

        System.out.println("Ingresar el consumo en m3: ");
        m3 = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresar el tipo de consumo: ");
        tipo = sc.nextLine();


/*        //Para probar método costo_residencial
        double costoR = costo_residencial(m3);
        System.out.printf("El costo residencial es: %.2f\n", costoR);

        //Para probar método costo_comercial
        double costoC = costo_comercial(m3);
        System.out.printf("El costo comercial es: %.2f\n", costoC);*/

        //Para probar método costo_total
        double costoT = costo_total(m3,tipo);
        System.out.printf("El costo a pagar es: %.2f\n", costoT);
    }

    static double costo_residencial(int m3){
        double costo = 0.0;
        for (int i=1; i<=m3 ; ++i){
            if (i>=1 && i<=28){
                costo += 0.0;
            }else if (i>28 && i<=150){
                costo += 2.1;
            }else if (i>150){
                costo += 1.5;
            }
        }
        return costo;
    }

    static double costo_comercial(int m3){
        double costo = 0.0;
        for (int i=1; i<=m3 ; ++i){
            if (i>=1 && i<=400){
                costo += 1.8;
            }else if (i>400){
                costo += 2.5;
            }
        }
        return costo;
    }

    static double costo_total(int m3, String tipo){
        double costo = 0.0;
        if (tipo.equals("r")){
            costo = costo_residencial(m3);
        }else if (tipo.equals("c")){
            costo = costo_comercial(m3);
        }
        return costo;
    }
}
