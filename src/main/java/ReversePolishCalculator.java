import java.util.Stack;

public class ReversePolishCalculator {

    Stack<Double> numbers = new Stack<Double>();
    Double number1;
    Double number2;


    public Double calculate(String input) {
        input.chars()
                .mapToObj(i -> (char)i)
                .forEach(n -> {
                    System.out.println(n);
            switch (n) {
                case '+':
                    getNums();
                    numbers.push(number1 + number2);
                case ' ':
                    break;
                default:
                    numbers.push(Double.parseDouble(String.valueOf(n)));
            }
        });
        return numbers.pop();
    }

    private void getNums(){
        number1 = numbers.pop();
        number2 = numbers.pop();
    }

}
