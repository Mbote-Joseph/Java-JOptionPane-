package MidTerm;

public class Test {
 
    public static void main(String[] args) {
        Doctor d1=new Doctor("ENT4567","Mohamed Ahmad","ENT-surgery");
        System.out.println(d1);
       
        Patient patientList[]=new Patient[20];
        //this will calculte how many patient is senior citizen in patientList
       
        int count=0;
        for(int i=0;i<patientList.length;i++){
            if(patientList[i].getAge()>60)
                count++;
        }
            
       
    }
 
 }