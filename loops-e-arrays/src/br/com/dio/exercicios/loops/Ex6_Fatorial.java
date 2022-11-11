package br.com.dio.exercicios.loops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {
   
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);

      int numeroFornecido = 0;
      int numeroFatorial = 0;

      System.out.print("Informe um número para calcular o fatorial: ");
      numeroFornecido = scan.nextInt();

      numeroFatorial = 1;

      for (int i = numeroFornecido; i > 0; i--) {
         numeroFatorial = numeroFatorial * i;
      }
      
      System.out.println(numeroFatorial);

      scan.close();
   }

}
