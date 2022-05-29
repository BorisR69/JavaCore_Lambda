public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        // код не работал, т.к. вызывалось исключение в связи с делением на 0, можно поймать
        // ArithmeticException и вывести сообщение, также можно решить проблему через тернарный оператор, но при этом
        // нельзя вывести сообщение об ошибке, а только целое число, например 0
        calc.println.accept(c);
    }
}
