import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.out);
        int i=0;
        do
        {
          i=i+1;
          System.out.println("Enter the employee salary :");
          int salary= input.nextInt();
         
        } while(salary>=0);
        double sum=0;
        sum= sum+ salary;
        double average= sum/i;
        System.out.println("The average is : "+ average);
        System.out.println("The number of employees are : "+ i);
      }
}
