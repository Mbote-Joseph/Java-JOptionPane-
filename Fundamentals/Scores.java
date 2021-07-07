import java.util.Scanner;
public class Scores {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter  your marks between 0 and 100 :");
        marks = input.nextInt();

        if(marks<60 && marks>=0){
            System.out.println("FAIL");
        }else{
            System.out.println("PASS");
        }
    }
}
