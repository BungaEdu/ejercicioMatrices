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
        int intereses = 0, i=0;
        System.out.println("Intereses ( pulsa 0 después del úlimo interés): ");
        intereses = sc.nextInt();
        int[] arrayIntereses = new int[100];
        while (intereses != 0) {
            arrayIntereses[i]=intereses;
            intereses = sc.nextInt();
            i++;
        }


    }



}










/**************************** BUCLE PARA calcular monto final
        float montoAnual = 0, sumMontoAnual=0;
        montoAnual = montoInicial;
        int[] arrayAños = new int[años];
        System.out.println((arrayIntereses[0]*100)+"%");
        for (int j = 0; j <= años; j++) {
            System.out.printf("%.2f\n",montoAnual);
            montoAnual = montoAnual + (montoAnual * arrayIntereses[0]);
            sumMontoAnual=sumMontoAnual+montoAnual;
        }
        System.out.println();    // Imprime salto de línea
    }
}
*/







/*******************IMPRIMIR EL ARRAY
        for(int j=0; j<=4;j++) {
            System.out.print(arrayIntereses[j]);
        }*/


