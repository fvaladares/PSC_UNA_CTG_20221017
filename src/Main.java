import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração do vetor
        int[] numeros = new int[10];
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor, informe números inteiros");
        // Estrutura de repetição para realizar a leitura dos dados
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nNúmero %d:", i + 1);
            numeros[i] = reader.nextInt();
        }
        System.out.println("\nFim da leitura, iniciando a impressão.\n");

        // Estrutura de repetição para realizar a impressão dos dados
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d, ", numeros[i]);
        }
    }
}