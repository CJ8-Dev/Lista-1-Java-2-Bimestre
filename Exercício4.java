package org.example;
import java.util.Scanner;

public class Exercício4 {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Preço " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            total += precos[i];
        }
        for (int i = 0; i< precos.length; i++) {
            System.out.printf("Preço %d: R$ %.2f%n", i + 1, precos[i]);
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
