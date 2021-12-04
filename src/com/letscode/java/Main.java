package com.letscode.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Entre com o numero para ver sua tabuada: ");
        int numberOne = numberScanner.nextInt();

        System.out.printf("%dx1: %d %n", numberOne, (numberOne * 1));
        System.out.printf("%dx2: %d %n", numberOne, (numberOne * 2));
        System.out.printf("%dx3: %d %n", numberOne, (numberOne * 3));
        System.out.printf("%dx4: %d %n", numberOne, (numberOne * 4));
        System.out.printf("%dx5: %d %n", numberOne, (numberOne * 5));
        System.out.printf("%dx6: %d %n", numberOne, (numberOne * 6));
        System.out.printf("%dx7: %d %n", numberOne, (numberOne * 7));
        System.out.printf("%dx8: %d %n", numberOne, (numberOne * 8));
        System.out.printf("%dx9: %d %n", numberOne, (numberOne * 9));
        System.out.printf("%dx10: %d %n", numberOne, (numberOne * 10));
    }
}
