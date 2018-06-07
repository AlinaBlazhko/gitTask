public class Main {
    public static void main(String[] args) {
        CalculatorUtil calculator = new CalculatorUtil();
        System.out.println(calculator.calculation(2, 3, "+"));

        if (calculator.calculation(2, 3, "+") == 5) {
            System.out.println("Correct answer:)");
        }else {
            System.out.println("Fail:(");
        }
    }
}
