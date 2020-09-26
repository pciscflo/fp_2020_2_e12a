package demo;

public class App1 {
    //globales a la clase
    static String[] codigos = { "A100", "A200", "B200", "C100","A400"};
    static String[] descripcion = {"Tuerca", "Martillo", "Carton", "Prensa", "Meza"};
    static double[] pesos = {12.0, 3.4, 9.0, 5.4, 6.2};
    static int[] stock = {100, 20, 50, 40, 10};

    public static void main(String[] args) {
        //local a main
        double[] precios = {100.80, 50.40, 30.20, 44.00, 10,80};
        String[] datos = buscarProducto("A400");
        System.out.println("Resultado1:");
        for (int i=0;i<datos.length;i++){
            if(datos[i]!=null) {
                System.out.println(datos[i]);
            }
        }
        System.out.println("****************");
        String data = buscarProducto2("A400");
        if (data!=null) {
            System.out.println("Resultado2:" + data);
        }
        System.out.println("3)**********************");
        String [] desc = obtenerDescripcionesProductosCuyoCodigoSeIniciaConA();
        for(int i=0; i<desc.length; i++){
            if(desc[i]!=null) {
                System.out.println(desc[i]);
            }
        }
        System.out.println("4)*********");
        System.out.println(obtenerPromedio(precios));
    }
    static String bascarDescripcion(String codigo){ //de todos modos busca aun encontrandolo
        String resultado=null;
        for (int i=0; i<descripcion.length;i++){
            if(codigos[i].equals(codigo)){
                resultado = descripcion[i];
            }
        }
        return resultado;//finalmente retorna lo encontrado
    }
    static String bascarDescripcion2(String codigo){//mas eficiente, si el codigo no se repite
        for (int i=0; i<descripcion.length;i++){
            if(codigos[i].equals(codigo)){
                return descripcion[i];
            }
        }
        return null;
    }

    static double obtenerPromedio(double precios[]){
        double promedio =0, suma = 0;
        for (int i=0; i<precios.length;i++){
            suma+=precios[i];
        }
        return suma/precios.length;
    }

    static String[]  obtenerDescripcionesProductosCuyoCodigoSeIniciaConA(){
        String [] resultadoDescripciones = new String[5]; // {"xxx", "yyy",  null, null    }
        int j=0;//indice
        for (int i=0; i<codigos.length;i++){
            if (codigos[i].substring(0,1).equals("A")){
                resultadoDescripciones[j] = descripcion[i];// {"Tuerca", "Martillo","Meza"}
                j++;
            }
        }
        return resultadoDescripciones;
    }

    static String[] buscarProducto(String codigoBuscar){//buscar los datos de un producto dado un codigo
        String[] datos = new String[4];
        for (int i=0; i<codigos.length;i++){
            if(codigos[i]==codigoBuscar){
                datos[0] = codigos[i];
                datos[1] =descripcion[i];
                datos[2] = String.valueOf(pesos[i]);
                datos[3] = String.valueOf(stock[i]);
            }
        }
        return datos;
    }
    static String buscarProducto2(String codigoBuscar){
        String resultado=null;
        for (int i=0; i<codigos.length;i++){
            if(codigos[i]==codigoBuscar){
               resultado = codigos[i] + ", " + descripcion[i] + ", " + pesos[i] + ", " + stock[i];
            }
        }
        return resultado; // "Datos:" + var1 + " " + var2 + "  + var4
    }

}
