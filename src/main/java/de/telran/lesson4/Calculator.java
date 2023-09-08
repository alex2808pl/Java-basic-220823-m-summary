package de.telran.lesson4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число = ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число = ");
        int num2 = scanner.nextInt();

        int add = getAddition(num1,num2);  //отдельная перемення для результата вічисления
        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + getSubtraction(num1, num2)); //используем виртуальную переменную как промежуточную
        System.out.println(num1 + " * " + num2 + " = " + getMultiplication(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + getDivision(num1, num2));

        System.out.println(15.0 + " / " + 0.0 + " = " + (15.0/0.0));

    }
    private static int getAddition(int num1, int num2) {
        return num1 + num2; //15
    }

    private static int getSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    private static int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    private static int getDivision(int num1, int num2) {
        if(num2 == 0) return 0; // проверка на деление на 0
        return num1 / num2;

//         int result = 0;
//         if(num2 == 0) result = 0;  // проверка на деление на 0
//         else result = num1 / num2;
//         return result;
    }
}


//    Создайте методы с математическими операциями +, -, *, /
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main.

