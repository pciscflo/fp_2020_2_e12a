package pe.upc.datos;

public class App2 {
    public static void main(String[] args) {
        int n=4787;
        System.out.println("Total Digitos:"+ cantidadDigitos(n));
        System.out.println("Cantidad de digitos 7: " + cantidadDigitos(n, 7));
    }
    static int cantidadDigitos(long numero){
        int contadorDigitos=0;
        //contar cuanto digitos tiene numero
        while(numero>0){ //cociente es mayor que cero
            contadorDigitos++;//1
            numero /= 10; // numero = numero /10 --> 3445, 344,34, 3, 0
            //System.out.println(numero);
        }
        return contadorDigitos;
    }

    static int cantidadDigitos(long numero, int digito){ //cantidad de digitos "digito" en el numero
        int contadorDigitos=0;
        while(numero>0){
            if(numero % 10 == digito){  //n % 10 --> residuo sucesivo -> digito
                contadorDigitos++;
            }
            numero /= 10;
        }
        return contadorDigitos;
    }
}
