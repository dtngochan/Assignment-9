
package StringExamples;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String output = new StringBuilder(input).reverse().toString();
        if(input.equals(output)){
            System.out.println("A string is a palindrome");
        }else{
            System.out.println("A string isn't a palindrome");
        }
    }
}
