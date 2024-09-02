import java.util.Scanner;

public class CalcularSequencia {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        
        int[] fibonacciSequence = calcularSequencia(40);
        
        boolean pertence = fazParteDaSequencia(n, fibonacciSequence);
        
        if (pertence) {
            System.out.println("O número " + n + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não faz parte da sequência de Fibonacci.");
        }

    }

    public static int[] calcularSequencia(int n) {
        int[] fibonacciSequence = new int[n];
        
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        return fibonacciSequence;
    }

    public static boolean fazParteDaSequencia(int n, int[] fibonacciSequence) {
        for (int i = 0; i < fibonacciSequence.length; i++) {
            if (fibonacciSequence[i] == n) {
                return true;
            }
        }
        return false;
    }
}
