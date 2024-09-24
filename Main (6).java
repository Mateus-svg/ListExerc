import java.util.Scanner;

public class CampeonatoLOL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalKills = 0, totalDeaths = 0, totalAssists = 0;

        while (true) {
            System.out.print("Há um vencedor? (s/n): ");
            String vencedor = scanner.next();

            if (vencedor.equalsIgnoreCase("s")) {
                System.out.println("O jogo terminou.");
                break;
            }

            System.out.print("Digite o número de kills: ");
            int kills = scanner.nextInt();
            totalKills += kills;

            System.out.print("Digite o número de deaths: ");
            int deaths = scanner.nextInt();
            totalDeaths += deaths;

            System.out.print("Digite o número de assists: ");
            int assists = scanner.nextInt();
            totalAssists += assists;

            if (totalKills <= 5) {
                System.out.println("noob");
            } else if (totalKills >= 20) {
                System.out.println("master");
            }

            if (totalDeaths >= 20) {
                System.out.println("Houston, we have a problem");
            }

            if (totalAssists >= 20) {
                System.out.println("team work");
            }

            System.out.println("Total Kills: " + totalKills);
            System.out.println("Total Deaths: " + totalDeaths);
            System.out.println("Total Assists: " + totalAssists);
        }
    }
}



