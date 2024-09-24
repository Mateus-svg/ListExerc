import java.util.Scanner;

public class ProdutoPorAdicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número real (A): ");
        double A = scanner.nextDouble();
        System.out.print("Digite um número inteiro (B): ");
        int B = scanner.nextInt();

        double produto = 0;
        for (int i = 0; i < Math.abs(B); i++) {
            produto += A;
        }

        if (B < 0) {
            produto = -produto;
        }

        System.out.println("O produto de A e B é: " + produto);
    }
}