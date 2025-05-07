import java.util.Scanner;

public class RileyExercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;
        final int totalExercicios = 10;

        // Pergunta quantos exercícios foram feitos
        System.out.print("Quantos dos 10 exercícios de programação Riley conseguiu fazer? ");
        int feitos = scanner.nextInt();

        // Validação para não ultrapassar o total permitido
        if (feitos < 0) {
            feitos = 0;
        } else if (feitos > totalExercicios) {
            feitos = totalExercicios;
        }

        int naoFeitos = totalExercicios - feitos;

        // Cálculo dos pontos
        alegria += feitos * 10;
        tristeza += naoFeitos * 10;

        // Exibe pontuação
        System.out.println("\nPontuação:");
        System.out.println("Alegria: " + alegria + " pontos");
        System.out.println("Tristeza: " + tristeza + " pontos");

        scanner.close();
    }
}
