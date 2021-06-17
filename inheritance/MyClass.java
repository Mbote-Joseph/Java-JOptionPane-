public class MyClass {

    private int a = 5;        

}



class Tester

{

 public static void main(String args[])

 {

    MyClass mc1 = new MyClass();

    MyClass mc2 = new MyClass();

 

    System.out.println(mc1.toString());

    if(mc1.equals(mc2))

         System.out.println("Same");

    else 

         System.out.println("Not Same");

 }

}
