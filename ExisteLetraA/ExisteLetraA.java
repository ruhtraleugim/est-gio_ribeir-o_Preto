package ExisteLetraA;

import java.util.Scanner;

public class ExisteLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine().toLowerCase();
        System.out.println(analizarPalavra(palavra));
    }
    public static Boolean analizarPalavra(String palavra){
        if (palavra.contains("a")) {
            return true;
        }else return false;
    }
}
