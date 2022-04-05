package Desafio3;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO AO DESAFIO 3");
        System.out.print("Informe o valor total a ser pago: ");
        double valorTotal = sc.nextDouble();

        double notasCem = 100.00;
        double notasCinquenta = 50.00;
        double notasDez = 10.00;
        double notasCinco = 5.00;
        double notasUm = 1.00;

        double moedaCinquenta = 0.50;
        double moedaDez = 0.10;
        double moedaCinco = 0.05;
        double moedaUm = 0.01;

        notasCem = (int) (valorTotal / 100);
        if((notasCem * 100) - valorTotal > 0) {
            notasCinquenta = (int)((notasCem * 100) - valorTotal) / 50;
        }


        System.out.println("Notas de 100: " + notasCem);
        System.out.println("Notas de 50: " + notasCinquenta);
        sc.close();




    }

}
