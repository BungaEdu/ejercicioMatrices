public class ej1Matrices {
    public static void main(String[] Arg) throws java.io.IOException {
     /*   int [][] matrizResultado = {{1,2,3,4},{10,20,30,40}};
        
        for (int x=0; x < matrizResultado.length; x++) {
              for (int y=0; y < matrizResultado[x].length; y++) {
                System.out.println(matrizResultado[0]);
                }
        }
        
        */
        int[][] matriz = {{2, 4, 4}, {6, 6, 9}, {8, 10, 12}};

        for (int x = 0; x < matriz.length; x++) {
            System.out.println("\n");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println(matriz[x][y]);
            }

        }
    }
}