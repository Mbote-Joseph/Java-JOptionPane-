package Assignment2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Reader {

	public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile= new Scanner(new FileReader("data.in"));
        String firstName;
        String secondName;
        String regNo;
        int age;
        int year;

        firstName= inFile.next();
        secondName=inFile.next();
        regNo=inFile.next();
        age= inFile.nextInt();
        year= inFile.nextInt();

        System.out.println("The Student "+ firstName+ " "+secondName+ " has the registration number "+ regNo+ " . He has "+age+" years and joined CS class of "+year);
        inFile.close();

        PrintWriter outFile= new PrintWriter("data.out");
        outFile.println("The Student "+ firstName+ " "+secondName+ " has the registration number "+ regNo+ " . He has "+age+" years and joined CS class of "+year);
		outFile.close();

	}

}
