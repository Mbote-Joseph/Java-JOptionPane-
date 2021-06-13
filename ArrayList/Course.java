package ArrayList;

import java.util.ArrayList;

public class Course {
    private String name;
    private String CID;
    private ArrayList<Student> studentList= new ArrayList();

    public Course(String n, String cid){
        name=n;
        CID=cid;
    }

    // Get and Set Methods
    // find a Student in the list, return the index if found

    // return -1 otherwise
    public int hasStudent(Student st){
        for(int i=0; i<studentList.size(); i++)
            if(st.equals(studentList.get(i)))
            return i;
        return -1;
    }

    // public boolean addStudent(Student st){

	// 	if (!studentList.contains(st)){
	// 		studentList.add(st);
	// 		return true;
	// 	}
	// 	return false;
	// }
    // public boolean contains(Student st) {
	// 	return studentList.contains(st);
	// }

    // Implement remove Student;
    public void addStudent(Student st){
        studentList.add(st);
    }
    public void removeStudent(Student st){
        studentList.remove(st);
    }
    // Implement Printing the student list
    public void printList(){
        for(int i=0; i<studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }

    public static void main(String[] args){
        Course oop=new Course("Objected Oriented Programming", "ITBP219");

        Student st= new Student("Ahmed", "20109589");

        oop.addStudent(st);
        st=new Student("Abdul Khalim", "20096783");
        oop.addStudent(st);
        st= new Student("Khalid", "20075023");
        oop.addStudent(st);

        // Print all the students registered
        oop.printList();
    }
    
}
