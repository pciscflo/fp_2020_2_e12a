package pe.edu.upc.cursofp.selectivas;

public class App1 {
    public static void main(String[] args) {

        System.out.println(detectaMensaje("rojo"));

    }

    static String detectaMensaje(String opcion){
        String mensaje;
        if(opcion.equals("rojo")) {
            mensaje = "no pase";
        } else if (opcion=="amarillo"){
            mensaje = "cuidado";
        }else if (opcion=="verde"){
            mensaje = "pase";
        }else if (opcion=="azul"){
            mensaje = "malogrado";
        }else {
            return "error";
        }
        return mensaje;
    }

}
