import java.util.Scanner;

public class mochila {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("cantidad de objetos: ");
        int cantidad = sc.nextInt();


        String[] nombres = new String[cantidad];
        double[] valores = new double[cantidad];
        double[] pesos = new double[cantidad];


        for(int i = 0; i < cantidad; i++){


            System.out.println("objeto " + (i + 1));


            System.out.print("nombre: ");
            nombres[i] = sc.next();


            System.out.print("valor: ");
            valores[i] = sc.nextDouble();


            System.out.print("peso: ");
            pesos[i] = sc.nextDouble();

        }


        System.out.print("capacidad mochila: ");
        double capacidad = sc.nextDouble();


        sc.close();

    }

}