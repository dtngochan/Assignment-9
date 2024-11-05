
package lecture4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci elements to display (n): ");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("The Fibonacci sequence will be " +first);
        if (n > 1) {
                System.out.print(" " + second);
            }
        for(int i = 2; i < n; i++){                       
            int next = first + second;
            System.out.print(" " +next);
            first = second;
            second = next;
        }
    }
}
