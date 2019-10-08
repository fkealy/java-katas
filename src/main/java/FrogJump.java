import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrogJump {

    public int solution1(int X, int[] A) {
        if (A.length == 0)
            return -1;

        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> numbersRequired = IntStream.rangeClosed(1, X).boxed().collect(Collectors.toList());

        for (int seconds = 0; seconds < A.length; seconds++) {
            numbersRequired.remove(numbers.get(seconds));
            if (numbersRequired.size() == 0) {
                return seconds;
            }
        }
        return -1;
    }

    public int solution2(int X, int[] A) {

        Set<Integer> numbersRequired = IntStream.rangeClosed(1, X).boxed().collect(Collectors.toSet());

        for (int seconds = 0; seconds < A.length; seconds++) {
            numbersRequired.remove(A[seconds]);
            if (numbersRequired.size() == 0) {
                return seconds;
            }
        }
        return -1;
    }

    public int solution3(int X, int[] A){
        int steps = X;
        boolean[] bitmap = new boolean[steps + 1];
        for(int i = 0; i < A.length; i++){
            if(!bitmap[A[i]]) {
                bitmap[A[i]] = true;
                steps--;
                if (steps == 0) return i;
            }
        }
        return -1;
    }



    //what is the minimum index where all integers from 1 -> X have occured?
    //remove each value from numbers when it  appears in A;
    //check the size of numbers after every iteration if it's zero return the current index;


}
