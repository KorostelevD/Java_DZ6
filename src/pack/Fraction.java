package pack;
import java.util.function.*; //підключення функцій

public class Fraction {

    private int flag; // числівник
    private int dig; // знаменник

    // Конструктор без параметрів
    public Fraction() {
        this.flag = 1;
        this.dig = 1;
    }

    // Конструктор з усіма параметрами
    public Fraction(int flag, int dig) {
        if (dig == 0) {
            //Пояснення помилки
            throw new IllegalArgumentException("Знаменник не може бути 0.");
        }
        this.flag = flag;
        this.dig = dig;
    }

    // Гетери
    public final Supplier<Integer> getFlag = () -> flag;
    public final Supplier<Integer> getDig = () -> dig;

    // Сетери
    public final Consumer<Integer> setFlag = p -> flag = p;
    public final Consumer<Integer> setDig = p -> {
        if (p == 0) {
            throw new IllegalArgumentException("Знаменник не може бути 0.");
        }
        dig = p;
    };

    // Перетворення дробу в рядок "1/2"
    public final Supplier<String> toStringFraction = () -> flag + "/" + dig;

    // Перетворення дробу в десятковий 1/2 -> 0.5
    public final Supplier<Double> toDecimal = () -> (double) flag / dig;

    // Порівняння цього дробу з іншим
    public final Predicate<Fraction> compare = f -> this.flag * f.dig == this.dig * f.flag;

    // Множення цього дробу на інший
    public final UnaryOperator<Fraction> multiply = f -> new Fraction(this.flag * f.flag, this.dig * f.dig);

    // Ділення цього дробу на інший
    public final UnaryOperator<Fraction> divide = f -> {
        if (f.flag == 0) {
            throw new IllegalArgumentException("Не можна ділити на дріб з чисельником 0.");
        }
        return new Fraction(this.flag * f.dig, this.dig * f.flag);
    };

    ///////////////////////////////////////
    // Статичні лямбда вирази
    public static final Function<Fraction, Double> decimal = f -> (double) f.flag / f.dig;

   /* public static final Function<String, Fraction> fromString = s -> {
        String[] parts = s.split("/");
        return new Fraction(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    };*/

    /*public static final BiPredicate<Fraction, Fraction> compareFractions = (f1, f2) -> f1.flag * f2.dig == f2.flag * f1.dig;

    public static final BinaryOperator<Fraction> multiplyFractions = (f1, f2) -> new Fraction(f1.flag * f2.flag, f1.dig * f2.dig);

    public static final BinaryOperator<Fraction> divideFractions = (f1, f2) -> {
        if (f2.flag == 0) {
            throw new IllegalArgumentException("Не можна ділити на дріб з чисельником 0.");
        }
        return new Fraction(f1.flag * f2.dig, f1.dig * f2.flag);
    };
*/

}
