package org.example;
import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double[] comDesconto = new double[5];
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Preço " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            comDesconto[i] = precos[i] * 0.9;
        }
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Original: R$ %.2f Com desconto: R$ %.2f%n", precos[i], comDesconto[i]);
        }
    }
}