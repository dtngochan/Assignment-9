
package StringExamples;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Enter a character to count: ");
        char target = scanner.next().charAt(0);
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == target){
                count++;
            }
        }
        System.out.println("A character '" +target +"' appears " +count +" times.");
    }
}
