import java.util.*;

public class smallestandlargetsinarray {   

   

public static void main (String[] args){
    System.out.println("Enter the number of elements for the array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int [n];
    System.out.println("Enter the elements of the array: ");  
   for(int i=0; i<n; i++)  
{  
 
arr[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
 
for (int i=0; i<n; i++)   
{  
System.out.println(arr[i]);  
} 

 
     int large =arr[0];
     int small= arr[0];
     for (int i=0;i<arr.length;i++){
        if (large<arr[i]){
            large=arr[i];
                

        if (small>arr[i]){
            small= arr[i];
                
            }   
        

}  
        }
 System.out.println("The Largest number in the array "+large);
 System.out.println("The Smallest number in the array "+small); 
    }
}


