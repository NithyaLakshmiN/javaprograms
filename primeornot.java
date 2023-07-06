import java.util.*;

public class primeornot {

    static boolean isprint(int n)
    {
        for (int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        }
         
public static void main (String[] args){
  System.out.println("Enter the number") ; 
  Scanner sc = new Scanner (System.in);
  int n = sc.nextInt();
  System.out.println(isprint(n));

}
    
}
