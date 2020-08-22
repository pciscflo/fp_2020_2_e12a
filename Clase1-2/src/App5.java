public class App5 {
    public static void main(String[] args) {
        int a = 18, b=9;
        int suma, multiplica, divide, resta, modulo;//libro Codigo Limpiom mnemónico
        double potencia;
        suma = a + b;
        divide = a /b;
        multiplica = a*b;
        divide = a/b;
        modulo = a%b; //resto de dividir 2 entre 3
        potencia = Math.pow(a,b);
        System.out.println("La suma es:" + suma);
        System.out.println("La division es:" + divide);//valor truncado
        System.out.println("Modulo:" + modulo);
        System.out.printf("La potencia es : %.2f", potencia);


    }
}
