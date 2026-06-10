import java.util.Scanner;

public class antenas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("cantidad de casas: ");
        int cantidad = sc.nextInt();

        int[] casas = new int[cantidad];

        for(int i = 0; i < cantidad; i++){

            System.out.print("posicion casa " + (i + 1) + ": ");
            casas[i] = sc.nextInt();

        }

        System.out.print("rango antena: ");
        int rango = sc.nextInt();

        sc.close();

    }

}