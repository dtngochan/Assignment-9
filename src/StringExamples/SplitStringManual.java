
package StringExamples;

import java.util.Scanner;

public class SplitStringManual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        //goi phuong thu splitWords voi tham so la input va tra ve  vao mang words
        String[] words = splitWords(input);
        for(String word:words){
            System.out.println(word);
        }
        
    }
    public static String[] splitWords(String str){
        //biểu thức chính quy \\s+ để phân tách chuỗi theo một hoặc nhiều khoảng trắng.
        return str.split("\\s+");
    }
}
