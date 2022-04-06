import java.util.Scanner;

//Tienes que meter los intereses en una variable y después esa variable la vas pasando al array

public class ej1Matrices {
    public static void main(String[] Arg) {
        Scanner sc = new Scanner(System.in);

/*********************LEER MONTO INICIAL**********/
        System.out.println("Monto inicial: ");
        int montoInicial = sc.nextInt();


        /*******************Porcentajes fijos*************/
        float[] arrayIntereses = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            arrayIntereses[i] = arrayIntereses[i] / 100;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayIntereses[i]);
        }

/****************AÑOS INVERSIÓN*******************/
        System.out.println("Años de inversión: ");
        int años = sc.nextInt();


/**************************** BUCLE PARA MOSTRAR MATRIZ POR PANTALLA*/////////////
        float montoAnual = 0, montoRep=0;
        montoAnual = montoInicial;
        int[] arrayAños = new int[años];
        System.out.println((arrayIntereses[0]*100)+"%");
        for (int j = 0; j <= años; j++) {
            System.out.println(montoAnual);
            montoAnual = montoAnual + (montoAnual * arrayIntereses[1]);
        }
        System.out.println();    // Imprime salto de línea
    }
}








/*******************IMPRIMIR EL ARRAY
        for(int j=0; j<=4;j++) {
            System.out.print(arrayIntereses[j]);
        }*/

        /*********************LEER PORCENTAJES**********
        int TAM = 0;

        int intereses = 1, i=1, z=5;
        System.out.println("Intereses (pulsa 0 después del úlimo interés): ");
        intereses = sc.nextInt();
        int[] arrayIntereses = new int[z];
        while (intereses != 0) {
            z++;
            intereses=arrayIntereses[i];
            arrayIntereses[i] = sc.nextInt();
            i++;
            System.out.println("prueba");
        }
        */
