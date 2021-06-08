package Cat3;

public class Patient {
    private String patientName;
    private int patientId;
    private int Age;
    
    public Patient(String patientName, int patientId, int patientAge) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.Age = patientAge;
    }
  
    public int getAge() {
        return Age;
    }
   
    public void setPatietAge(int patientAge) {
        this.Age = patientAge;
    }
   
    public String GroupOfAge()
    {
        if(Age>60)
            return "Senior";
        return "Not_Senior";
    }
    
    public String toString() {
        return "The patient " + patientName + ", ID:" + patientId + " is "+GroupOfAge();
    }  
   
 }
  