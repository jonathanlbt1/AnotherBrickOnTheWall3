package Desafio1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dados[] dados = new Dados[10];

        int idade, counter = 0;
        double altura, peso = 0.0;
        int idadeMaior = 0;
        double mediaAltura = 0.0;
        double porcentagemPeso = 0.0;

        System.out.println("SEJA BEM VINDO AO DESAFIO 1");
        for(int i=0; i < 10; i++) {
            System.out.println();
            System.out.println("Entre com os dados da pessoa numero " + (i+1));
            System.out.print("Idade: ");
            idade = sc.nextInt();

            System.out.print("Altura: ");
            altura = sc.nextDouble();
            System.out.print("Peso: ");
            peso = sc.nextDouble();

            if (idade >= 10 && idade <= 20) {
                mediaAltura += altura;
                counter++;
            }
            if (idade > 50) {
                idadeMaior++;
            }
            if (peso < 40) {
                porcentagemPeso++;
            }
            dados[i] = (new Dados(idade, altura, peso));
        }

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + idadeMaior);
        System.out.printf("A media das alturas das pessoas com idade entre 10 e 20 anos e : %.2f", (mediaAltura / counter));
        System.out.printf("\nA porcentagem das pessoas com peso inferior a 40 quilos entre todas as " +
                "pessoas analisadas: %.2f", ((porcentagemPeso / 10) * 100));

        sc.close();
    }

}
