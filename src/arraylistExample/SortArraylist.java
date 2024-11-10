
package arraylistExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,3,8,2,4));
        Collections.sort(numbers);
        System.out.println("The list after sorted is: " +numbers);
    }
}
