import java.util.*;

public class plaindromeornot {

    static boolean ispalindrome(String str){

        String revstring ="";
        char ch;
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            revstring= ch+revstring;
        }
        System.out.println("Reversed String= " +revstring);    

        if (str.equals(revstring)){
            System.out.println("This is Palindrome");
            return true;
        }

        else{
          System.out.println("This is not Palindrome");  
          return false;
        }
    }
        
   

 public static void main (String[] args){
    System.out.println("Enter the original string");
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();
    System.out.println("Original String= " +str);
    ispalindrome(str);

 }   
    
}
