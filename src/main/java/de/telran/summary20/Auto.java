package de.telran.summary20;

public class Auto extends Object{
    private int mileage;
    private String color;
    private String name;

    public void run() {
        System.out.println(color+ " авто марки "+name+" с пробегом "+mileage+" едет...");
    }

    public String run(String destination) {
        System.out.println(color+ " авто марки "+name+" с пробегом "+mileage+" едет...");
        return "Я еду -> "+destination;
    }

    public Auto() {
        mileage = 0;
        color = null;
        name = null;
    }

    public Auto(String argName) {
        name = argName;
    }


    public Auto(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Auto(int mileage, String name) {
        this.mileage = mileage;
        this.name = name;
    }

    public Auto(int mileage, String color, String name) {
        this.mileage = mileage;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mileage=" + mileage +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';

    }
}
