package pe.upc.datos;

public class App4 {
    public static void main(String[] args) {
        //hacer un subprograma que dado un numero obtenga la cantidad de digitos pares n % 2 ---> 0
        long n = 876;
        System.out.println(cantidadDeDigitosPares(n));//TDD Test Drive Development - Progr. Orie. a Pruebas Agiles
        System.out.println(obtenerDigitosPares(n));
    }

    static long obtenerDigitosPares(long numero) {
        long cantidadDigitosPares = 0;
        long digitoSolo=0;
        while(numero>0){
            digitoSolo = numero % 10;
            if(digitoSolo % 2 == 0){  //n % 10 --> residuo sucesivo -> digito
                cantidadDigitosPares++;
            }
            numero /= 10;
        }
        return  cantidadDigitosPares;
    }
    public static int cantidadDeDigitosPares(long numero){
        int contadorDigitos=0;
        while (numero>0){
            if (numero%2==0){ //n%10 residuo
                contadorDigitos++;
            }
            numero/=10;
        }
        return contadorDigitos;
    }
}
