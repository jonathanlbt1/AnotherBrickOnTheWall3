package Desafio2;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM VINDO AO DESAFIO 2");

        System.out.print("Informe a primeira letra: ");
        char letraUm = sc.next().charAt(0);

        System.out.print("Informe a segunda letra: ");
        char letradois = sc.next().charAt(0);

        if(letraUm > letradois) {
            System.out.println("Não está na ordem alfabética");
        } else {
            System.out.println(letraUm + ", " + letradois + " = " + ((letradois - letraUm)-1));
        }
        sc.close();
    }
}
