
package arrays;

import java.util.Scanner;

public class CountOccurrences {
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
        System.out.print("Enter the element to count: ");
        int target = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                count++;
            }
        }
        System.out.print("The element " +target +" appears " +count +" times in the array: ");
    }
}
