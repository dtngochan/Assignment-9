
package StringExamples;

import java.util.Scanner;

public class ConvertCaseManual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String convert = convertCase(input);
        System.out.println("Original string: " +input);
        System.out.println("Converted string: " +convert);
        
    }
    public static String convertCase(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            //duyet qua moi ki tu trong chuoi va gan no cho 'ch' de kiem tra
            char ch = str.charAt(i);
            //kiem tra neu la ki tu hoa thi chuyen ve chu thuong
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch)); 
                //bien ki tu hoa thanh hoa va theo ki tu do vao chuoi StringBuilder result
            }else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }else{
                result.append(ch);
                //neu khong phai ki tu thi giu nguyen
            }
        }
        return result.toString();
        //chuyen tro lai hcuoi
    }
}
