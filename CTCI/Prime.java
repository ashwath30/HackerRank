public class Solution {
    
    public static boolean isPrime(int n){
        
        if(n<2)
           return false;
            
           for(int i=2;i<=Math.sqrt(n);i++){ 
               //Instead of checking till n, we can check till vn because a larger factor of n must be a multiple of smaller                           factor that has been already checked.
            if(n%i == 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        in.close();
    }
}