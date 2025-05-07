import java.util.Scanner;

public class RileyAmizade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

        System.out.print("Riley fez novas amizades na cidade? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Quantas amizades Riley fez? ");
            int quantidade = scanner.nextInt();
            alegria += quantidade * 10;
        } else {
            tristeza += 30;
        }

        System.out.println("\nPontuação:");
        System.out.println("Alegria: " + alegria + " pontos");
        System.out.println("Tristeza: " + tristeza + " pontos");

        scanner.close();
    }
}
