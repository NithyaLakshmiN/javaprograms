public class emp {

    String name ;
    int empid;
    int salary;

public String empname(String name){
    System.out.println("Emp name is" +name);
    return name;
}


public int empid(int empid){
    System.out.println("Emp ID is" +empid);
    return empid;
}

public int empsalary(int salary){
    System.out.println("Emp salary is" +salary);
    return salary;
}

public static void main (String args[]) {
    
emp obj= new emp();
obj.empname("Nithya");
obj.empid(1000);
obj.empsalary(40000);

emp obj2= new emp();
obj2.empname("Lakshmi");
obj2.empid(2000);
obj2.empsalary(8000);

}
    
}
