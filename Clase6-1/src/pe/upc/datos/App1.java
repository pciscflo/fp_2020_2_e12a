package pe.upc.datos;

public class App1 {
    public static void main(String[] args) {
        String s;
        s = mensaje("Carlos");
        System.out.println(s);
        int f;
        f = suma(3,4);
        System.out.println("Suma:" + f);
    }
    static String mensaje(String cadena){//metodo, subprograma, módulo, función, procedimiento
        return "Hola mundo " + cadena;
    }
    static int suma(int a, int b){//datos de entrada...dado dos numeros calcular la suma de ellos
        return (a + b);
    }
}
