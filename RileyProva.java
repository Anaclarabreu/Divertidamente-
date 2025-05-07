import java.util.Scanner;

public class RileyProva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

        // Entrada das notas
        System.out.print("Digite a nota da prova A1 (0 a 10): ");
        double a1 = scanner.nextDouble();

        System.out.print("Digite a nota da prova A2 (0 a 10): ");
        double a2 = scanner.nextDouble();

        System.out.print("Digite a nota da prova A3 (0 a 10): ");
        double a3 = scanner.nextDouble();

        // Calculo da media
        double media = (a1 + a2 + a3) / 3.0;

        // Verifica se foi aprovada
        if (media >= 7.0) {
            alegria += 50;
            System.out.println("Riley foi aprovada! (+50 Alegria)");
        } else {
            tristeza += 50;
            System.out.println("Riley não foi aprovada. (+50 Tristeza)");
        }

        // Exibe pontuação
        System.out.println("\nPontuação:");
        System.out.println("Alegria: " + alegria + " pontos");
        System.out.println("Tristeza: " + tristeza + " pontos");

        scanner.close();
    }
}
