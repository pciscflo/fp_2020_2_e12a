public class App {
    public static void main(String[] args) {
        int severidad = 0;
        severidad = obtenerPuntajeSeveridad("desconectado", "luz");
        System.out.println("Severidad:" + severidad);
        int total = 0;
        total = calcularPuntajeTotal("desconectado", "luz", "ok", "humo",
                "error", "puerta");
        System.out.println("Total:" + total);
        String personal =null;
        personal = calcularPersonalContactar(total);
        System.out.println("Contactactar:" + personal);

    }

    static String calcularPersonalContactar(int puntajeTotal) {
        String personal = null;
        if (puntajeTotal==0) {
           personal ="Ninguno";
        } else  if (puntajeTotal>=1 && puntajeTotal<=3){
           personal = "Jefe Operaciones";
        } else if(puntajeTotal>=4 && puntajeTotal<=7){
           personal = "Supervisor Operaciones";
        } else if (puntajeTotal>=8){
            personal = "Gerente Operaciones";
        }
        return personal;
    }

    static int calcularPuntajeTotal(String estado1, String sensor1,
                                    String estado2, String sensor2,
                                    String estado3, String sensor3) {
        int total = 0;
        total = obtenerPuntajeSeveridad(estado1, sensor1) + obtenerPuntajeSeveridad(estado2, sensor2) +
                obtenerPuntajeSeveridad(estado3, sensor3);
        return total;
    }

    static int obtenerPuntajeSeveridad(String estado, String sensor) {
        int puntaje = 0;
        switch (sensor) {
            case "luz":
                if (estado == "ok") {
                    puntaje = 0;
                } else if (estado == "error") {
                    puntaje = 1;
                } else if (estado == "desconectado") {
                    puntaje = 3;
                }
                break;
            case "humo":
                if (estado == "ok") {
                    puntaje = 0;
                } else if (estado == "error") {
                    puntaje = 2;
                } else if (estado == "desconectado") {
                    puntaje = 3;
                }
                break;
            case "puerta":
                if (estado == "ok") {
                    puntaje = 0;
                } else if (estado == "error") {
                    puntaje = 3;
                } else if (estado == "desconectado") {
                    puntaje = 4;
                }
                break;
        }
        return puntaje;
    }
}
