package pe.upc.datos;

public class App6Sueldos {
    public static void main(String[] args) {
        System.out.println(calcularPorcentajeAumentoNAños("G", 3000, 10));
    }
    static double calcularPorcentajeAumentoNAños(String tipoTrabajador, double sueldo, double n){
        double nuevoSueldo = 0;
        for (int i =1; i<=n ; i++){
            if (tipoTrabajador=="G"){
                if (i % 4 == 0){
                    nuevoSueldo+=0.18*sueldo;//nuevoSueldo = nuevoSueldo + 0.18*sueldo; //acumulador
                }else {
                    nuevoSueldo+=0.14*sueldo;
                }

            }else { //E
                if (i % 4 == 0){
                    nuevoSueldo+=0.12*sueldo;//nuevoSueldo = nuevoSueldo + 0.18*sueldo; //acumulador
                }else {
                    nuevoSueldo+=0.08*sueldo;
                }
            }
        }
        return nuevoSueldo;
    }
    static double calcularSueldoDespuesNAños(String tipoTrabajador, double sueldo, double n){
        return sueldo*n + calcularPorcentajeAumentoNAños(tipoTrabajador, sueldo, n);
    }


}
