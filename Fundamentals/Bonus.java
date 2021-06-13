package Fundamentals;

import java.util.Scanner;
public class Bonus {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int bonus;

        System.out.println("Enter the number of years the employee has worked :");
        int years=input.nextInt();

        if(years<=4){
            bonus=years*100;
            System.out.println("The employee total bonus to be paid is :"+bonus);
        }else if(years >=5 && years <=8){
            bonus=years*90;
            System.out.println("The employee total bonus to be paid is :"+bonus);
        }else if(years> 8){
            bonus= years*85;
            System.out.println("The employee total bonus to be paid is :"+bonus);
        }else{
            System.out.println("The employee has o bonus");
        }

      
    }
    
}
