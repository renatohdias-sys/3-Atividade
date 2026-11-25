import java.util.Scanner;

public class Maioremenordamatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][3];

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("Digite um numero: ");
                matriz[i][j] = sc.nextInt();

                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                }

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}