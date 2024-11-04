
package lecture4;

public class OddAndEven {
    public static void main(String [] args){
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sumEven += i;
            }else{
                sumOdd += i;
            }
        }
        System.out.println("Sum of all even numbers from 1 to 100: " +sumEven);
        System.out.println("Sum of all odd numbers from 1 to 100: " +sumOdd);
    }
}
