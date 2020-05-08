import SortArray.java
import java.util.*;

public class TestSortArray {
    public static void main(String[] args){
        SortArray test = new SortArray({5,4,3,2,1,7,5,4,5,4,3,3,23,4});

        test.sortArray();
        System.out.println(test.toString());
    }

}
