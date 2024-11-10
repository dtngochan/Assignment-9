
package arraylistExample;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdateAnElement {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.set(3, 100);
        System.out.println(Arrays.toString(numbers.toArray()));
        
    }
}
