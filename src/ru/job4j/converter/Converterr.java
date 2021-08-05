package ru.job4j.converter;

public class Converterr {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converterr.rubleToEuro(140);
        int usd = Converterr.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + usd + " usd.");
    }
}