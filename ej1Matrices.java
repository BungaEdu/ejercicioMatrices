import java.util.Arrays;
import java.util.Scanner;

//Tienes que meter los intereses en una variable y después esa variable la vas pasando al array

public class ej1Matrices {
    public static void main(String[] Arg) {
        Scanner sc = new Scanner(System.in);

/*********************LEER MONTO INICIAL**********/
        System.out.println("Monto inicial: ");
        int montoInicial = sc.nextInt();

/****************AÑOS INVERSIÓN*******************/
        System.out.println("Años de inversión: ");
        int años = sc.nextInt();

/*********************LEER PORCENTAJES*/
        int intereses = 0, i = 0, tamArray = 0;
        System.out.println("Dime cuántos intereses quieres calcular: ");
        tamArray = sc.nextInt();
        int[] arrayIntereses = new int[tamArray];
        System.out.println("Dime los intereses: ");
        for (i = 0; i < arrayIntereses.length; i++) {
            arrayIntereses[i] = sc.nextInt();
        }

/**************************** BUCLE PARA calcular monto final */
        float montoAnual = 0, sumMontoAnual=0;
        montoAnual = montoInicial;
        int[] arrayAños = new int[años];


        System.out.println((arrayIntereses[0])+"%");
        for (int j = 0; j <= años; j++) {
            System.out.printf("%.2f\n",montoAnual);
            montoAnual = montoAnual + ((float) montoAnual * arrayIntereses[0]/100);
            sumMontoAnual=sumMontoAnual+montoAnual;

        }
        System.out.println();

/***************IMPRIMIR MATRIZ****************/
        int[][] matriz = {{2, 4, 4}, {6, 6, 9}, {8, 10, 12}};
        for(int i = 0; i<matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");    // Imprime elemento
            }
            System.out.println();    // Imprime salto de línea
        }




    }
}





