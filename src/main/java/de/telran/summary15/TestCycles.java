package de.telran.summary15;

public class TestCycles {
    public static void main(String[] args) {

        int i=0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        for (i=0; i<5; i++) {
            System.out.println(i);
        }


        System.out.println();

        i=0;
        do {
            if(i > 2) break;
            System.out.println(i);
            i++;
        } while(i < 5);

     }
}
