package Desafio3;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO AO DESAFIO 3\n");
        System.out.print("Informe o valor total a ser pago: ");
        double valorTotal = sc.nextDouble();
        System.out.println();
        opcaoParaTroco(valorTotal);

        sc.close();
    }

    public static void opcaoParaTroco(double valorTotal) {
        //Cedulas de papel
        int notasCem = (int) valorTotal / 100;
        System.out.println("Notas de 100: " + notasCem);

        int notasCinquenta = (int) ((valorTotal - (notasCem * 100)) / 50);
        System.out.println("Notas de 50: " + notasCinquenta);

        int notasDez = (int) (((valorTotal - (notasCem * 100)) - (notasCinquenta * 50)) / 10);
        System.out.println("Notas de 10: " + notasDez);

        int notasCinco = (int) ((((valorTotal - (notasCem * 100)) - (notasCinquenta * 50)) - (notasDez * 10) ) / 5);
        System.out.println("Notas de 5: " + notasCinco);

        int notasUm = (int) (((((valorTotal - (notasCem * 100)) - (notasCinquenta * 50)) - (notasDez * 10)) - notasCinco * 5));
        System.out.println("Notas de 1: " + notasUm);

        int cedula = (int) valorTotal;
        double moeda = (valorTotal - cedula) * 100;

        //Moedas
        int moedaCinquenta = (int) moeda / 50;
        System.out.println("Moedas de 50 centavos: " + moedaCinquenta);

        int moedaDez = (int) ((moeda - (moedaCinquenta * 50)) / 10);
        System.out.println("Moedas de 10 centavos: " + moedaDez);

        int moedaCinco = (int) ((moeda - (moedaCinquenta * 50) - (moedaDez * 10)) / 5);
        System.out.println("Moedas de 5 centavos: " + moedaCinco);

        int moedaUm = (int) ((moeda - (moedaCinquenta * 50) - (moedaDez * 10) - (moedaCinco * 5)));
        System.out.println("Moedas de 1 centavo: " + moedaUm);
    }

}
