import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeMais50 = 0;
        double somaAlturas = 0;
        int contAlturas = 0;
        int contPesoInferior40 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            System.out.print("Digite o peso da pessoa " + (i + 1) + ": ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                quantidadeMais50++;
            }
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contAlturas++;
            }
            if (peso < 40) {
                contPesoInferior40++;
            }
        }

        double mediaAlturas = contAlturas > 0 ? somaAlturas / contAlturas : 0;
        double porcentagemPesoInferior40 = (contPesoInferior40 / 10.0) * 100;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + quantidadeMais50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas);
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: " + porcentagemPesoInferior40 + "%");
    }
}


