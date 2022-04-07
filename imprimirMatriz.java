import java.util.Scanner;

public class imprimirMatriz {
    public static void main(String[] Arg) {
        int[][] matriz = new int[2][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime datos");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]);

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
