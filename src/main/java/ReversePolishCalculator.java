import java.util.Arrays;
import java.util.Stack;

public class ReversePolishCalculator {

    private static Stack<Double> numbers = new Stack<Double>();
    private static Double number1;
    private static Double number2;


    public Double calculate(String input) {
        Arrays.stream(input.split(" "))
                .forEach(n -> {
                    switch (n) {
                        case "+":
                            getNumbers();
                            numbers.push(number1 + number2);
                            break;
                        case "-":
                            getNumbers();
                            numbers.push(number1 - number2);
                            break;
                        case "*":
                            getNumbers();
                            numbers.push(number1 * number2);
                            break;
                        case "/":
                            getNumbers();
                            numbers.push(number1 / number2);
                            System.out.println(numbers.peek());
                            break;
                        default:
                            numbers.push(Double.parseDouble(n));
                            break;
                    }
        });
        return numbers.pop();
    }

    private static void getNumbers(){
        number2 = numbers.pop();
        number1 = numbers.pop();
    }

}
