
package arrays;

import java.util.Scanner;

public class SumAndAverageArray {
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
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double average = (double) sum / elements;
        System.out.println("The sum of array elements: " +sum);
        System.out.printf("The average of array elements: %.2f", average);
    }
}
