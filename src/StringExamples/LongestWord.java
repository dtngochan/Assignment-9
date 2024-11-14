
package StringExamples;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String longestWord = findLongestWord(input);
        System.out.println("The longest word in a string is: " +longestWord);
    }
    public static String findLongestWord(String str){
        String[] words = str.split("\\s+");
        String longest = "";
        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        return longest;
    }
}
