
package arrays;

import java.util.Scanner;

public class LargestAndSmallestInArray {
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
        int largest = numbers[0];
        int smallest = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest element in the array: " +largest);
        System.out.println("Smallest element in the array: " +smallest);
    }
}
