
package lecture4;

public class PrimeNumber {
    static boolean checkPrimeNumber(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;            
    }
    public static void main(String [] args){
        System.out.print("All prime numbers from 1 to 100: ");
        for(int i = 1; i <= 100; i++){
            if(checkPrimeNumber(i)){
                System.out.print(i +" ");
            }
        }
    }
}
