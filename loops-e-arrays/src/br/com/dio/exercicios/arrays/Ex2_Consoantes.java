package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      String[] letras = new String[6];
      int numeroConsoantes = 0;

      int count = 0;
      do {
         System.out.print("Informe uma letra: ");
         String letra = scan.next();

         if (
            !(letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u"))
         ) {
            numeroConsoantes++;
            letras[count] = letra;
         }

         count++;
      } while (count < letras.length);

      System.out.println("Você digitou " + numeroConsoantes + " consoantes.");
      for (String consoante : letras) {
         if (consoante != null)
            System.out.print(consoante + " ");
      }
      System.out.println("");
      scan.close();
   }
   
}
