import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha a sua jogada:");
        System.out.println("1 - Par 2 - Ímpar");
        byte escolha = teclado.nextByte();

        if (escolha == 1 || escolha == 2) {
            jogar(teclado, escolha);
        } else {
            System.out.println("Opção inválida!!!");
        }
    }

    private static void jogar(Scanner teclado, byte escolha) {
        System.out.println("Digite um número:");
        byte numeroJogador = teclado.nextByte();
        byte numeroComputador = (byte) (new Random().nextInt(10) + 1);

        boolean ePar = (numeroJogador + numeroComputador) % 2 == 0;

        if ((escolha == 1 && ePar) ||
                (escolha == 2 && !ePar)) {
            System.out.println("Parabéns, você ganhou!!!");
        } else {
            System.out.printf("Lamento, o computador ganhou, pois ele escolheu %d", numeroComputador);
        }
    }
}
