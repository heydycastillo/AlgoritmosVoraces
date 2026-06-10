import java.util.Scanner;

public class antenas {

    public static void main(String[] args) {

        System.out.println("problema cobertura de antenas");

        Scanner sc = new Scanner(System.in);

        System.out.print("cantidad de casas: ");
        int cantidad = sc.nextInt();

        int[] casas = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("posicion casa " + (i + 1) + ": ");
            casas[i] = sc.nextInt();
        }

        System.out.print("rango antena: ");
        int rango = sc.nextInt();

        sc.close();

        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
                if (casas[j] > casas[j + 1]) {
                    int aux = casas[j];
                    casas[j] = casas[j + 1];
                    casas[j + 1] = aux;
                }
            }
        }

        int i = 0;
        int total = 0;

        System.out.println("\nantenas colocadas en:");

        while (i < cantidad) {
            int antena = casas[i] + rango;
            System.out.println(antena);
            total++;
            int cobertura = antena + rango;

            while (i < cantidad && casas[i] <= cobertura) {
                i++;
            }
        }

        System.out.println("cantidad total de antenas: " + total);
    }
}