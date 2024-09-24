import java.util.Scanner;

public class SequenciaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            System.out.println(numero + i);
        }
    }
}