public class stringreverse{

   public static void main (String args[]) {

    String str = "Geeks";
    String revstring = "";
    char ch;

    System.out.print("Original String : ");
    System.out.println(str);

    for (int i=0;i<str.length();i++){
        ch = str.charAt(i) ;
        revstring = ch+revstring;

    }

     System.out.print("Reversed String :" +revstring)  ;
     


   }


}

