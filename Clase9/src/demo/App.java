package demo;


public class App {

    static String []coduser = {"I2586","I0025","I5522","I0936","I0080"};
    static String []nombres = {"MariaCanales","AndresAguirre","RaulRamirez","AnaBautista","JoseEspinoza"};
    static String []area = {"Contabilidad","Marketing","RRHH","Gerencia","Ventas"};
    static String []tipoAtencion = {"Incidente","Incidente","Requerimiento","Incidente","Requerimiento"};
    static String []tipoEquipo = {"PC","Laptop","Laptop","PC","PC"};
    static int []edad = {20, 45, 23, 34, 22};


    public static void main(String[] args) {
        System.out.println("Porcentaje:" + obtenerPorcentajeIncidentes());
        System.out.println("Datos encontrados:");
        String data [] =  obtenerDatos("I0080");
        for (int i=0; i<data.length;i++){
            if (data[i]!=null){
                System.out.println(data[i]);
            }
        }

    }

    static double obtenerPorcentajeIncidentes(){
        double contadorIncidentes=0;
        for(int i=0; i< tipoAtencion.length; i++){
             if(tipoAtencion[i]=="Incidente"){
                 contadorIncidentes++;
             }
        }
        return 100*(contadorIncidentes/tipoAtencion.length);
    }
    static String[] obtenerDatos(String codigo){
        String datos[] = new String[6];
        for(int i=0; i< coduser.length; i++){
            if(coduser[i]==codigo){
                //obtener los datos del usuario
                datos[0] = coduser[i];
                datos[1] = nombres[i];
                datos[2] = area[i];
                datos[5] = String.valueOf(edad[i]);
            }
        }
        return datos;
    }

}