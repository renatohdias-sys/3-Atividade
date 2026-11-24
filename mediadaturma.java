import java.util.Scanner;

public class mediadaturma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;
        double media;

        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno: ");
            notas[i] = sc.nextDouble();

            soma = soma + notas[i];

            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        media = soma / 5;

        System.out.printf("Media da turma: %.2f%n", media);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        sc.close();
    }
}