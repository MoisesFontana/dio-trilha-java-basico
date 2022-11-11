package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
   
   public static void main(String[] args) {

      int[] vetor = {3, 5, 8, 10, 9, 7};

      for (int i = (vetor.length -1); i >= 0; i--) {
         System.out.println(vetor[i]);
      }
      
   }

}
