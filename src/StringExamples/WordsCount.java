
package StringExamples;

import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sttring: ");
        String input = sc.nextLine();
        int words = count(input);
        System.out.println("Numbers of words: " +words );
    }
    public static int count(String str){
        //loai bo khoang trang va tach tu
        String[] words = str.trim().split("\\s+");
        //kiem tra xem chuoi co rong hay tu dau co phai rong(dau ccah) khong
        if(words.length == 0){
            return 0;
        }
        return words.length;
    }
}
