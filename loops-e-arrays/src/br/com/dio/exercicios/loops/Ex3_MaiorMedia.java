package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;
        int count = 0;

        do {
            System.out.println("Informe um número");
            numero = scan.nextInt();

            soma += numero;

            if (numero > maior) maior = numero;

            count++;
        } while (count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.print("O média dos números é: " + (soma/5));

        scan.close();
    }
}
