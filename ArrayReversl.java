import java.util.Arrays;
public class ArrayReversl {
    
    static void  reverse (int[] ar){
        int i=0;
        int j = ar.length -1;
        while(i<j){
            int t = ar[i];
            ar[i]= ar[j];
             ar[j]= t;
             i++;
             j--;

        }
}

public static void main (String args[]){
    int [] ar = {10,20,30,40,50};
    for(int i=0; i<ar.length; i++){
        
        

    }
    System.out.print("Before  =" +Arrays.toString(ar)+ " ");

    reverse(ar);
    System.out.println();
    for(int i=0; i<ar.length; i++){
        
        
}
System.out.print("After  =" +Arrays.toString(ar)+ " ");
}
}
