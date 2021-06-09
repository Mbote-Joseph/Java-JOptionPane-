package MidTerm;


public class Doctor {
    private String ID;
    private String name;
    private String speciality;
   
    public Doctor(String iD, String name, String speciality) {
        ID = iD;
        this.name = name;
        this.speciality = speciality;
    }
    
    public String getID() {
        return ID;
    }
    
    public void setID(String iD) {
        ID = iD;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSpeciality() {
        return speciality;
    }
    
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    public String toString() {
        return "Dr." + name + ", ID: "+ID+", is specialized in: " + speciality ;
    }
   
   
 }

 
 
 