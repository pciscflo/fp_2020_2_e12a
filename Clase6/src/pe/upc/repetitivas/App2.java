package pe.upc.repetitivas;

public class App2 {
    public static void main(String[] args) {
        int cantidad=1;
        while (cantidad<=10){ //cuando es verda pasa
            System.out.println(cantidad);//1,2,3..., 10
            cantidad++;//2,3,..., 10, 11
        }
        System.out.println("Otro While");
        cantidad = 1;
        while(cantidad<10){
            cantidad++;//2, 3, 4, ..9, 10
            System.out.println(cantidad); //2,3, 4, .., 9, 10
        }

    }
}
