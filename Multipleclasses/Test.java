package Multipleclasses;

public class Test {
    public static void main(String[] args){
        Actor A1= new Actor("Adam", 1990);
        Actor A2= new Actor("Sally", 1980);

        System.out.println(A1.getAge());
        System.out.println(A1.toString());

        Actor actorArray[]=new Actor[10];
        actorArray[0]= A1;
        actorArray[1]=A2;
        
        int counter=0;
        double sum =0;
        for(int i=0;i<actorArray.length;i++){
            sum += actorArray[i].getAge();
            counter ++;
               
        }
        double average = sum / counter;

        System.out.println(average);
        
    
    }
}
