package ArrayList;

public class Student {
    private String name;
    private String id;
    public Student(String n, String id){
        name=n;
        this.id=id;
    }
    // Get and Set Methods
    public String toString(){
        return "Name : "+ name +", ID :"+id;
    }

    // equals method
    public boolean equals(Object obj){
        return true;
    }
    
}
