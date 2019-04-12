import java.util.Arrays;

public class BinaryChop {

    public int chop(int target, int[] input) {
        System.out.println(Arrays.toString(input));
        int index = input.length / 2;
        int counter = 0;
        //search for target by halving array size each time and checking if value is greater than or smaller
        while(counter <= input.length / 2) {
            System.out.printf("index = %d && counter == %d \n",index,counter);
            if(input[index] == target){
                System.out.printf("Found the index, it's: %d",index);
                return index;
            } else if (input[index] < target) {
                index += (input.length - index)/2;
            } else if (input[index] > target) {
                index -= (input.length - index) / 2;
            }
            counter ++;
        }
        System.out.println("couldn't find it returning -1");
        return -1;
    }
}
