import java.util.Arrays;
import java.util.stream.IntStream;


public class PDiff {

    public int solution(int[] A) {

        IntStream.of(A).distinct().count();
        long sumright = Arrays.stream(A).skip(1).mapToLong( i -> (long) i).sum();
        long sumleft = A[0];;
        long ans = Math.abs( sumleft - sumright );;

        for (int P = 1; P < A.length; P++) {
            if (Math.abs( sumleft - sumright ) < ans) {
                ans = Math.abs( sumleft - sumright );
            }
            sumleft += A[P];
            sumright -= A[P];
        }
        return (int) ans;
    }
}