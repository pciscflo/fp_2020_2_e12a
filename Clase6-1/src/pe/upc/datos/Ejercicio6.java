package pe.upc.datos;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) { //Practika 6.0
        Scanner sc = new Scanner(System.in);
        double medicina;
        int dias;
        double porcentaje;

        System.out.println("Ingresar la cantidad de medicina: ");
        medicina = sc.nextDouble();

        System.out.println("Ingresar el número de días: ");
        dias = sc.nextInt();

        System.out.println("Ingresar el % a eliminar: ");
        porcentaje = sc.nextDouble();

        //Para probar método medicinaEnElCuerpo
        double medicinaRest = medicinaEnElCuerpo(medicina,dias);
        System.out.printf("Después de %d se eliminará %.2f de medicina\n", dias,medicinaRest);

        //Para probar método diasEnEliminarMedicina
        int diasElim = diasEnEliminarMedicina(medicina,porcentaje);
        System.out.printf("Tardará %d días en eliminar la medicina\n", diasElim);
    }

    static double medicinaEnElCuerpo(double medicina, int dias){
        int contdias = 0;
        double medicinaRes = medicina;

        while (contdias < dias){
            medicinaRes = medicinaRes - medicinaRes*0.20;
            contdias += 1;
        }
        return medicinaRes;
    }

    static int diasEnEliminarMedicina(double medicina, double porcentaje){

        double medicinaAEliminar = medicina * porcentaje / 100;
        double sumaMedicinaAEliminar = 0.0;
        int contdias = 0;
        double aEliminar =  0.0;

        while (medicinaAEliminar > sumaMedicinaAEliminar){
            aEliminar = medicina * 0.20;
            medicina = medicina - aEliminar;
            sumaMedicinaAEliminar = sumaMedicinaAEliminar + aEliminar;
            contdias += 1;
        }
        return contdias;
    }
}
