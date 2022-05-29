public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        // b==0 деление на 0 - вызывает исключение
        int c = calc.devide.apply(a, b);


        Calculator calc1 = Calculator.instance.get();
        int a1 = calc1.plus.apply(1, 2);
        int b1 = calc1.minus.apply(1,1);
        int c1 = calc1.devide.apply(a1, b1);
        calc.println.accept(c1);
    }
}
