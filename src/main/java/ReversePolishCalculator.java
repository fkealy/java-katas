import java.util.Stack;
import java.util.stream.Stream;

public class ReversePolishCalculator {

    Stack<Double> numbers = new Stack<Double>();
    Double number1;
    Double number2;


    public Double calculate(String input) {

        switch(input) {
            case "+":
                getNums();
                numbers.push(number1 + number2);
            default:
                numbers.push(Double.parseDouble(input));
        }
        return numbers.pop();
    }

    private void getNums(){
        Double number1 = numbers.pop();
        Double number2 = numbers.pop();
    }

}
