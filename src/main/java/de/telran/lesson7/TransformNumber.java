package de.telran.lesson7;

import java.util.Scanner;

public class TransformNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первоначальную систему счисление = ");
        int inNumbers = scanner.nextInt();

        System.out.print("Введите число = ");
        String inStr = scanner.next(); //1af
        long inStrNumber = Long.parseLong(inStr,inNumbers);

        System.out.print("В какую систему счисления преобразовать = ");
        int outNumbers = scanner.nextInt();

        System.out.println("Преобразованное число = " + Long.toString(inStrNumber, outNumbers));

        ///
//        long n16 = Long.parseLong("333", 16);
//        System.out.println(n16);
//        System.out.println(Long.toString(n16, 10));
    }
}

//    Переведите число 333 из 16-ричной в 10-ричную
//
//        Переведите число 819 из 10-ричной в 16-ричную
//
//        101101 в двоичной, переведите в 10-ричную
//
//        124 в десятичной, переведите в 2-ичную