public class App2 {
    public static void main(String[] args) {
        int edad = 21;
        double numeroFavorito = 2.5;
        double peso = 70.5;
        double talla = 1.72;
        String nombre = "Juan Perez";
        String nacionalidad = "Peruana";
        int numeroFavoritoEntero = (int) numeroFavorito; //type casting, cambio de tipo

        System.out.println("Mi nombre es:" + nombre);
        System.out.println("Mi edad es:" + edad);
        System.out.println("Mi numero favorito es:"+ numeroFavorito+" y esta en decimales");
        System.out.printf("Mi peso es %f kilos \n", peso);
        System.out.printf("Mi talla es %.2f metros", talla);
        System.out.printf("Mi numero favorito es %d \n", numeroFavoritoEntero);
        System.out.printf("Mi nacionalidad es %s", nacionalidad);

    }
}
