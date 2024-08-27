package pack;

import static pack.Fraction.*;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        // Використання гетерів

        System.out.println("Числівник f1: " + f1.getFlag.get());
        System.out.println("Знаменник f1: " + f1.getDig.get());
        System.out.println();
        System.out.println("Числівник f2: " + f2.getFlag.get());
        System.out.println("Знаменник f2: " + f2.getDig.get());
        System.out.println();
        System.out.println("Дріб f1: " + f1.toStringFraction.get());
        System.out.println("Дріб f1: " + f2.toStringFraction.get());
        System.out.println();


        // Використання сетера
        f1.setFlag.accept(5);
        f1.setDig.accept(6);
        System.out.println("Новий дріб f1: " + f1.toStringFraction.get());

        // Перетворення в десятковий формат
        System.out.println("Десятковий формат f1: " + f1.toDecimal.get());

        // Множення дробів
        Fraction f3 = f1.multiply.apply(f2);
        System.out.println("f1 * f2 = " + f3.toStringFraction.get());

        // Ділення дробів
        Fraction f4 = f1.divide.apply(f2);
        System.out.println("f1 / f2 = " + f4.toStringFraction.get());

        // Статичне порівняння дробів
        boolean isEqual = compareFractions.test(f1, f2);
        System.out.println("f1 дорівнює f2: " + isEqual);

        // Статичне перетворення рядка в дріб
        Fraction f5 = fromString.apply("7/8");
        System.out.println("Дріб з рядка: " + f5.toStringFraction.get());

        // Статичне перетворення дробу в десятковий формат
        double decimalValue = decimal.apply(f5);
        System.out.println("Десятковий формат f5: " + decimalValue);

    }
}