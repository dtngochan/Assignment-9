
package StringExamples;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray(); //bien chuoi thanh mang ki tu
        for(int i = 0; i <input.length()/2 ;i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1- i] = temp;
        }
        //tao chuoi moi tu mang ki tu da dao nguoc
        String reverse = new String(charArray);
        System.out.println("A string after reversed: " +reverse);
    }
}
