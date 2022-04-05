package Desafio4;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO AO DESAFIO 4 - THE LAST ONE!");
        System.out.print("Insira uma letra que eu direi se e vogal ou consoante: ");
        char letra = sc.next().toLowerCase().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Voce digitou uma vogal!");
        } else {
            System.out.println("Voce digitou uma consoante!");
        }
        sc.close();
    }
}
