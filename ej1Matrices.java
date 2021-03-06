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
        int tamArrayInvers = 0;
        System.out.println("Dime cuántos intereses quieres calcular: ");
        tamArrayInvers = sc.nextInt();
        int[] arrayIntereses = new int[tamArrayInvers];
        System.out.println("Dime los intereses: ");
        for (int i = 0; i < arrayIntereses.length; i++) {
            arrayIntereses[i] = sc.nextInt();
        }

/**************************** BUCLE 2 primeras filas */
        float montoAnual = 0, sumMontoAnual = 0;
        montoAnual = montoInicial;

        float[][] matrizImprimirResultado = new float[años + 3][tamArrayInvers]; //Le sumo 3 para: fila montoInicial, porcentaje y sumMontoAnual;

        for (int p = 0; p < matrizImprimirResultado.length; p++) {
            matrizImprimirResultado[0][p] = ((int) arrayIntereses[p]);
            matrizImprimirResultado[1][p] = montoInicial;
        }

        for (int n = 0; n < tamArrayInvers - 1; n++) {
            System.out.print(matrizImprimirResultado[0][n] + " ");    // Imprime elemento
        }
        System.out.println();    // Imprime salto de línea


/*****************************BUCLE MATRIZ*/
        int s = 0;
        for (int q = 2; q <= años; q++) {
            montoAnual = montoAnual + ((float) montoAnual * arrayIntereses[s] / 100);
            for (s = 0; s <= tamArrayInvers + 1; s++) { //puede que haya desbordamiento
                matrizImprimirResultado[q][s] = montoAnual;
                sumMontoAnual = sumMontoAnual + montoAnual;
            }
            System.out.println();
        }

        for(int a = 0; a<matrizImprimirResultado.length; a++) {
            for (int e = 0; e < matrizImprimirResultado[a].length; a++) {
                System.out.print(matrizImprimirResultado[a][e] + " ");    // Imprime elemento
            }
            System.out.println();    // Imprime salto de línea
        }


    }
}



/***************IMPRIMIR MATRIZ****************
        int[][] matriz = {{2, 4, 4}, {6, 6, 9}, {8, 10, 12}};
        for(int i = 0; i<matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");    // Imprime elemento
            }
            System.out.println();    // Imprime salto de línea
        }
*/



/************ejemploProfe para imprimir************
Arrays.fill (Para la primera fila)
for(i=1............)
        for(.........)

//CALCULO INTERESES
for(i=0......)
    imprimir intereses ("%13d%c",intereses[i],'%')
for(i=0, i<long-1)
    for(j=0.......)

    imprimir calculo("%14.2f",matriz[i])
for(i=ultimafila)
    imprimir calculo
imprimir monto final
*/



/*****************PUNTUACIÓN*****************************
Hemos conseguido que la matriz esté bien hecha, calculos y demás 3/3
si en la impresión he conseguido imprimir bien monto (0/1) y porcentaje (0/1)
He conseguido controlar duplicados (0/1)
Sacar los porcentajes ordenados de mayor y menor (0/1)
controles: capital negativo(0/0,5), tipo de interés negativo(0/0,5), años negativos(0/0,5)
binarysearh, sort, fil, (0/1,5)
Entrega(0,5)
 */