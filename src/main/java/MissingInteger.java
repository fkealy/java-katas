public class MissingInteger {

    public int solution(int[] A) {
        if (A.length == 1 && A[0] != 1) {
            return 1;
        }
        boolean[] bitmap = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < A.length && A[i] > 0) {
                bitmap[A[i]] = true;
            }
        }
        for (int i = 1; i < bitmap.length; i++) {
            if (bitmap[i] == false) {
                return i;
            }
        }
        return bitmap.length + 1;
    }

    //find smallest positive integer missing from A, minimum is 1
    //for each elem of A if it's negative ignore it if it's
    //order array remove all negative integers then compare to
    //create a bitmap
    //filter a stream for positive integers
    //for the index
}
