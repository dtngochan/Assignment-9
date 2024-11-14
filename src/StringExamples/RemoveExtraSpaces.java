
package StringExamples;

import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        //trim(): xoa khoang tarng dau va cuoi
        //replaceAll() thay the tat ca khoang trang o giua bang 1 khoang trang duy nhat " "
        //'\\s+' dai dien cho 1 hoac nhieu khoang trang
        String remove = input.trim().replaceAll("\\s+"," ");
        System.out.println("Removed string: " +remove);
    }
      
}
