import java.util.Scanner;

public class factorial {

    static int fact(int n){
        int res =1;
        for (int i=1 ;i<=n;i++){
            res= res*i;
        }
        return res;
        


    }

    public static void main (String args[]){
         System.out.println("Enter the number of Factorial to be generated");
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         fact(n);
         System.out.println(fact(n));

    }
    
}
