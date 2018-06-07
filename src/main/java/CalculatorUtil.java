import java.util.Scanner;

public class CalculatorUtil {

    public int calculation(int a, int b, String oper){
        int result = 0;
        if (oper.equals("+")){
            result = a + b;
        }
        if (oper.equals("-")){
            result = a - b;
        }
        if (oper.equals("*")){
            result = a * b;
        }
        if (oper.equals("/")){
            result = a / b;
        }
        return result;
    }
}
