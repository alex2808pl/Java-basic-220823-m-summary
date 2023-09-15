package de.telran.summary15;

import java.util.Random;
import java.util.Scanner;

public class TestInputData {

    public static void main(String[] args) {
        int myInt;
        myInt = 25;
        System.out.println("Присвоение = "+myInt);

        myInt = inputInt();
        System.out.println("Ввод с клавиатуры = "+myInt);

        myInt = randomInt(10, 66);
        System.out.println("Сгенерировали значение = "+myInt);

        System.out.println("Нужно ввести данные для интервала генерации:");
        System.out.println("Минимальное значение:");
        int minMain = inputInt();
        System.out.println("Максимальное значение:");
        int maxMain = inputInt();
        myInt = randomInt(minMain, maxMain);
        System.out.println("Сгенерировали значение = "+myInt);
    }

    static int inputInt() {
        System.out.print("Введите данные: ");
        Scanner scanner = new Scanner(System.in);
        int inpInt = scanner.nextInt();
        return inpInt;
    }

    static int randomInt(int min, int max) {   //50..100    33+50 = 149  9+50  30 55
        Random random = new Random();
        int ranInd = random.nextInt(max-min)+min;
        return ranInd;
    }
}
