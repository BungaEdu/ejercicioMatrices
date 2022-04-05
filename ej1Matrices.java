import java.util.Scanner;

public class ej1Matrices {
    public static void main(String[] Arg) {
        Scanner sc = new Scanner(System.in);

/*********************LEER MONTO INICIAL**********/
        System.out.println("Monto inicial: ");
        int montoInicial = sc.nextInt();

/*********************LEER PORCENTAJES**********/
        int TAM = 0;

        int intereses = 0, i=0, z=1;
        System.out.println("Intereses (pulsa 0 después del úlimo interés: ");
        intereses = sc.nextInt();
        while (intereses != 0) {
            int[] arrayIntereses = new int[z++];
            intereses=arrayIntereses[i];
            arrayIntereses[i] = sc.nextInt();
            i++;
        }
/*******************IMPRIMIR EL ARRAY
        for(int j=0; j<=4;j++) {
            System.out.print(arrayIntereses[j]);
        }*/


        /**************************** BUCLE PARA MOSTRAR MATRIZ POR PANTALLA
         int[][] matriz = {{2, 4, 4}, {6, 6, 9}, {8, 10, 12}};
         for(int i = 0; i < matriz.length; i++){
         for(int j = 0; j < matriz[i].length; j++){
         System.out.print(matriz[i][j] + " ");	// Imprime elemento
         }
         System.out.println();	// Imprime salto de línea

         }
         */
    }
}