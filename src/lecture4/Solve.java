
package lecture4;

import java.util.Scanner;

public class Solve {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        double a,b; //khai báo a, b kiểu số thực
        double x; //khai báo nghiệm         
        System.out.println("Enter a : ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");       
        b = scanner.nextDouble();
        System.out.println("The equation entered is: " +a +"x + " +b +" = 0");
        if(a == 0){
            if(b == 0){
                //Nếu a = 0 và b = 0 thì phương trình vô số nghiệm
                System.out.println("The equation has infinitely many solutions.");      
            }else{
                //Nếu a = 0 và b != 0 thì phương trình vô nghiệm
                System.out.println("The equation has no real solutions."); 
            }
        }else{
            //Nếu a != 0 thì phương trình có 1 nghiệm duy nhất
            x = -b/a;
            System.out.println("The equation has 1 solution is: " +x);
        }
    }
}
