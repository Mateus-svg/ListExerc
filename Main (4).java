import java.util.Scanner;

public class ProdutoSomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int produtoImpares = 1;
        int somaPares = 0;
        boolean encontrouImpar = false;

        while (true) {
            System.out.print("Digite um número inteiro positivo (ou negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                produtoImpares *= numero;
                encontrouImpar = true;
            }
        }

        System.out.println("Produto dos números ímpares: " + (encontrouImpar ? produtoImpares : 0));
        System.out.println("Soma dos números pares: " + somaPares);
    }
}

