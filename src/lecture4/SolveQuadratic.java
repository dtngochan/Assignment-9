
package lecture4;

import java.util.Scanner;

public class SolveQuadratic {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        double a, b, c; //Khai báo 3 hệ số kiểu số thực
        //Thực hiên nhập a và kiểm tra nếu a = 0 thì nhập lại. Vì phương trình bậc 2 thì hệ số a phải khác 0
        do{
            System.out.println("Enter a (a != 0): ");
            a = scanner.nextDouble();
            if(a == 0){
                System.out.println("a is zero. Please re-enter a.");
            }
        }while(a == 0);
        //Nhập b và c
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();
        System.out.println("The equation entered: " +a +"x^2 + " +b +"x + " +c +" = 0");
        double delta = b * b - 4 * a * c;
        //Kiểm tra delta
        if(delta < 0){
            //delta < 0 thì phương trình vô nghiệm
            System.out.println("The equation has no real solutions.");
        }else if(delta > 0){
            //delta >0 thì phương trình có 2 nghiệm riêng biệt
            double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("The equation has 2 distinct solutions is: x1 = " +x1 +" and x2 = " +x2);
        }else{
            //delta == 0 thì phương trình có 1 nghiệm kép
            double x = b / (2 * a);
            System.out.println("The equation has 1 double solution: x = " +x);
        }
        
    }
}
