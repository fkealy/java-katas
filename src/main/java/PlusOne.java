import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlusOne {

    // when you add one to a number the unit
// increases unless the unit is 9 in which case +1 is added to the preceeding position and all after are set to 0;
// then add a 0 to the last position of the array list
// iterate backwards and then forwards if none found
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        removeStartingZeros(A);
        int notNine = findNotNineIndex(A);
        if(notNine == -2){
            A.add(0);
            int n = A.get(0) == 9 ? 1 : A.get(0) + 1;
            A.set(0,n);
            setZerosAfter(A.listIterator(0));
        } else {
            addOneToPos(A,notNine);
            if(A.size()!= 1) {
                setZerosAfter(A.listIterator(notNine));
            }
        }
        return A;

    }

    private void removeStartingZeros(ArrayList<Integer> A) {
        for( int n = 0 ;n < A.size(); n++) {
            if (A.size() > 1 && A.get(n) == 0) {
                A.remove(n);
            } else if(A.get(n) != 0){
                break;
            }
        }
    }

    private void setZerosAfter(ListIterator<Integer> listIterator) {
        listIterator.next();
        while(listIterator.hasNext()){
            listIterator.next();
            listIterator.set(0);
        }
    }

    private int findNotNineIndex(List<Integer> A){
        ListIterator<Integer> lit = A.listIterator(A.size());
        while (lit.hasPrevious()) {
            int index = lit.previousIndex();
            Integer value = lit.previous();
            if (value != 9) {
                return index;
            }
        }
        return -2;
    }

    private void addOneToPos(List<Integer> A, int pos) {
        int n =  A.get(pos) + 1;
        A.set(pos, n);
    }

}

