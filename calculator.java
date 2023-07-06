public class calculator {
    int a;
    int b;

public int sumofnumbers(int a, int b){
    int c = a+b;
    System.out.println("The sum of two numbers = " +c);
    return c;
}  

public int prodofnumbers(int a, int b){
    int c = a*b;
    System.out.println("The Prod of two numbers = " +c);
    return c;
} 

public int diffofnumbers(int a, int b){
    int c = a-b;
    System.out.println("The diff of two numbers = " +c);
    return c;
}
    
public static void main (String args[]){
    calculator obj = new calculator();
    obj.sumofnumbers(10, 20);
    

    calculator obj1 = new calculator();
    obj1.prodofnumbers(10, 20);

    calculator obj3 = new calculator();
    obj3.diffofnumbers(10, 20);
}
}


