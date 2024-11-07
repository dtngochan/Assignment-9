
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int elements = scanner.nextInt();
        int[] numbers = new int[elements];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter element " +i +": ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.print("The array after sorting:" +Arrays.toString(numbers));
    }
}
 
