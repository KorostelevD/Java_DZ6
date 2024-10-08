package pack;

import static pack.Fraction.*;
import java.util.function.Consumer;


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
        System.out.println("Дріб f2: " + f2.toStringFraction.get());
        System.out.println();

        // Перетворення в десятковий формат
        System.out.println("Десятковий формат f1: " + f1.toDecimal.get());
        System.out.println("Десятковий формат f2: " + f2.toDecimal.get());
        System.out.println();


        // Порівняння дробів
        System.out.println("Порівняння дробей");
        boolean isEqual = f1.compare.test(f2);
        System.out.println("f1 дорівнює f2: " + isEqual);
        System.out.println();

        // Множення дробів
        System.out.println("Множення та ділення дробей");
        Fraction f3 = f1.multiply.apply(f2);
        System.out.println("F3 = f1 * f2 = " + f3.toStringFraction.get());

        // Ділення дробів
        Fraction f4 = f1.divide.apply(f2);
        System.out.println("F4 = f1 / f2 = " + f4.toStringFraction.get());
        System.out.println();

        // Статичне перетворення дробу в десятковий формат
        double decimalValue3 = decimal.apply(f3);
        System.out.println("Десятковий формат F3: " + decimalValue3);

        // Статичне перетворення дробу в десятковий формат
        double decimalValue4 = decimal.apply(f4);
        System.out.println("Десятковий формат F4: " + decimalValue4);

        System.out.println();
        System.out.println("! СТАТИЧНІ ЛЯМДА ВИРАЗИ  !");
        Fraction parsedFraction = Fraction.fromString.apply( "1/2");
        System.out.println("Parsed Fraction: " + parsedFraction.toStringFraction.get());

        System.out.println("Static Are Equal: " + Fraction.areEqual.test(f1, f2));

        Fraction staticMultiply = multiply1.apply(f1, f2);
        System.out.println("Static Multiply: " + staticMultiply.toStringFraction.get());

        Fraction staticDivide = Fraction.divide1.apply(f1, f2);
        System.out.println("Static Divide: " + staticDivide.toStringFraction.get());


        // Створення посилання на метод Tools.print
        Consumer<Object> printMethodRef = Tools::print;

        // Виклик методу через посилання на метод
        printMethodRef.accept("");
        printMethodRef.accept("МЕТОД ДЛЯ ВИВОДУ В КОНСОЛЬ");

    }
}