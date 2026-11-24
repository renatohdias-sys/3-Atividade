import java.util.Scanner;

public class Pesquisadevalores {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

            soma = soma + numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Numeros digitados:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nPares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}