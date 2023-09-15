package de.telran.summary15;

public class TestSwitch {
    public static void main(String[] args) {
        String str = "Вт";
        byte dayOfWeek = 0;

        switch (str) {
            case "Пн" :
                dayOfWeek = 1;
                break;
            case "Вт" :
                dayOfWeek = 2;
                break;
            default:
                dayOfWeek = -1;
        }
        System.out.println(str + " - это день недели - "+dayOfWeek);
    }


}
