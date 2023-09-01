package de.telran.lesson2;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int myInt = scanner.nextInt();
        int sum = myInt + 10;
        System.out.println("Сумма +10 = "+sum);

        System.out.print("Введите дробное число: ");
        double myDouble = scanner.nextDouble();
        System.out.println(myDouble-10);

        System.out.print("Введите строку: ");
        Scanner scannerStr = new Scanner(System.in);
        String myStr = scannerStr.nextLine();
        System.out.println(myStr + "!!!");

    }
}
