package de.telran.summary20;

public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.run();

        Auto auto2 = new Auto("BMW");
        auto2.run();

        Auto auto4 = new Auto(null, "белый");
        auto4.run();

        Auto auto3 = new Auto("VW", "красный");
        auto3.run();
        System.out.println(auto3);

        System.out.println();
        System.out.println(auto3.run("Berlin"));

    }
}
