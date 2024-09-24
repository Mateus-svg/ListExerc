import java.util.Scanner;

public class PerdaMassaRadioativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a massa inicial do material (em gramas): ");
        double massaInicial = scanner.nextDouble();

        while (massaInicial >= 0.10) {
            double tempo = 0;
            double massa = massaInicial;

            while (massa >= 0.10) {
                massa *= 0.75; // perde 25%
                tempo += 30;   // 30 segundos
            }

            System.out.println("Tempo necessário para a massa de " + massaInicial + "g se tornar menor que 0,10g: " + tempo + " segundos.");

            System.out.print("Digite a massa inicial do material (em gramas) ou 0 para sair: ");
            massaInicial = scanner.nextDouble();
        }
    }
}
