
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] produtos = {
            "Caderno", "Caneta", "Lapis", "Borracha"
        };

        int[] quantidade = {10, 25, 30, 8};

        double[] preco = {18.90, 2.50, 1.20, 3.00};

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=== PAPELARIA ===");
            System.out.println("1 - Listar estoque");
            System.out.println("2 - Entrada de produto");
            System.out.println("3 - Saida (venda)");
            System.out.println("4 - Valor total do estoque");
            System.out.println("0 - Sair");

            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {

                for (int i = 0; i < 4; i++) {
                    System.out.println("Codigo: " + (i + 1));
                    System.out.println("Produto: " + produtos[i]);
                    System.out.println("Quantidade: " + quantidade[i]);
                    System.out.printf("Preco: R$ %.2f%n", preco[i]);
                    System.out.println("-------------------");
                }

            } else if (opcao == 2) {

                System.out.print("Codigo do produto (1 a 4): ");
                int codigo = sc.nextInt();

                if (codigo >= 1 && codigo <= 4) {

                    System.out.print("Quantidade para adicionar: ");
                    int entrada = sc.nextInt();

                    if (entrada > 0) {

                        quantidade[codigo - 1] =
                                quantidade[codigo - 1] + entrada;

                        System.out.println("Estoque atualizado!");

                    } else {
                        System.out.println("Quantidade invalida!");
                    }

                } else {
                    System.out.println("Codigo invalido!");
                }

            } else if (opcao == 3) {

                System.out.print("Codigo do produto (1 a 4): ");
                int codigo = sc.nextInt();

                if (codigo >= 1 && codigo <= 4) {

                    int posicao = codigo - 1;

                    System.out.print("Quantidade vendida: ");
                    int venda = sc.nextInt();

                    if (venda > 0 && venda <= quantidade[posicao]) {

                        quantidade[posicao] =
                                quantidade[posicao] - venda;

                        double total = venda * preco[posicao];

                        System.out.printf("Venda: R$ %.2f%n", total);
                        System.out.println("Restam: " + quantidade[posicao]);

                    } else if (venda > quantidade[posicao]) {

                        System.out.println("Estoque insuficiente!");
                        System.out.println("Disponivel: "
                                + quantidade[posicao]);

                    } else {
                        System.out.println("Quantidade invalida!");
                    }

                } else {
                    System.out.println("Codigo invalido!");
                }

            } else if (opcao == 4) {

                double total = 0;

                for (int i = 0; i < 4; i++) {

                    total = total + quantidade[i] * preco[i];
                }

                System.out.printf("Valor total: R$ %.2f%n", total);

            } else if (opcao == 0) {

                System.out.println("Programa encerrado!");

            } else {

                System.out.println("Opcao invalida!");
            }
        }

        sc.close();
    }
}
