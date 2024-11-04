
package lecture4;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sum = 0;
        while(n > 0){
            sum += (n % 10);
            n = n/10;
        }
        System.out.println("Sum of digits of n: " +sum);
    }
}
