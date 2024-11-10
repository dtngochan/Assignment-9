
package arraylistExample;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args){
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(12);
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("The elements of the array: ");
        for(Integer number : array){
            System.out.println(number);
        }
    }
}
