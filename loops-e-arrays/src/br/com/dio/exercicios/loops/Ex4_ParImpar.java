package br.com.dio.exercicios.loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParImpar {
   
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);

      int numero = 0;
      int parCount = 0;
      int imparCount = 0;

      System.out.println("Quantos números você quer informar? ");
      int quantidadeNumeros = scan.nextInt();

      int count = 1;
      while(count <= quantidadeNumeros) {

         System.out.println("Informe o " + count +"º número: ");
         numero = scan.nextInt();

         count++;

         if (numero % 2 == 0) parCount++;
         else imparCount++;

      }

      System.out.print("Você informou " + parCount + " números pares e " + imparCount + " números impares.");

      scan.close();
   }

}
