import java.util.Scanner;

public class mochila {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        // ingreso de cantidad de objetos
        System.out.print("cantidad de objetos: ");
        int cantidad = sc.nextInt();


        String[] nombres = new String[cantidad];
        double[] valores = new double[cantidad];
        double[] pesos = new double[cantidad];


        // ingreso de datos de cada objeto
        for(int i = 0; i < cantidad; i++){


            System.out.println("\nobjeto " + (i + 1));


            System.out.print("nombre: ");
            nombres[i] = sc.next();


            System.out.print("valor: ");
            valores[i] = sc.nextDouble();


            System.out.print("peso: ");
            pesos[i] = sc.nextDouble();

        }


        System.out.print("\ncapacidad mochila: ");
        double capacidad = sc.nextDouble();



        // calcular valor/peso
        double[] ratios = new double[cantidad];


        for(int i = 0; i < cantidad; i++){

            ratios[i] = valores[i] / pesos[i];

        }



        // ordenar de mayor a menor ratio (Greedy)

        for(int i = 0; i < cantidad - 1; i++){


            for(int j = 0; j < cantidad - i - 1; j++){


                if(ratios[j] < ratios[j + 1]){


                    // cambiar ratios
                    double auxRatio = ratios[j];

                    ratios[j] = ratios[j + 1];

                    ratios[j + 1] = auxRatio;



                    // cambiar valores

                    double auxValor = valores[j];

                    valores[j] = valores[j + 1];

                    valores[j + 1] = auxValor;



                    // cambiar pesos

                    double auxPeso = pesos[j];

                    pesos[j] = pesos[j + 1];

                    pesos[j + 1] = auxPeso;



                    // cambiar nombres

                    String auxNombre = nombres[j];

                    nombres[j] = nombres[j + 1];

                    nombres[j + 1] = auxNombre;


                }

            }

        }



        // seleccion de objetos completos

        double valorTotal = 0;

        double restante = capacidad;



        System.out.println("\nobjetos seleccionados:");



        for(int i = 0; i < cantidad; i++){



            if(pesos[i] <= restante){



                restante -= pesos[i];

                valorTotal += valores[i];



                System.out.println(
                    nombres[i] + " completo"
                );


            }

        }



        System.out.println(
            "\nvalor total aproximado: " +
            (int)valorTotal
        );



        sc.close();

    }

}