import java.util.Arrays;
public class Apuntes {
    public static void main(String[] Arg) {
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