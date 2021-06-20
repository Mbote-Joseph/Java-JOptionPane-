package Lab3;
import java.util.Scanner;

import java.io.FileWriter;  

import java.io.IOException;  

public class Main

{

   

   

  static void printArray(Meeting[] meetings) {

      for (int a=0; a<meetings.length;a++){

      System.out.println("Date: "+meetings[a].getDate()+" " +"Place: " + meetings[a].getPlace()+ " " + "Topic: " + meetings[a].getTopic());

    }

  System.out.println();

  }

   

  static void outputFile(Meeting[] meetings) {

    try {

     FileWriter writeMeetingData = new FileWriter("meetingdata.txt");

     for (int a=0; a<meetings.length;a++){

      writeMeetingData.write("Date: "+meetings[a].getDate()+" " +"Place: " + meetings[a].getPlace()+ " " + "Topic: " + meetings[a].getTopic());

    }

      

     writeMeetingData.close();

     System.out.println("Successfully save the meetings to the file.");

  } catch (IOException e) {

     System.out.println("An error occurred.");

     e.printStackTrace();

  }

  }

   

   

	public static void main(String[] args) {

	  Scanner scanner = new Scanner(System.in);  

  

    String date;

    String place;

    String topic;

	  Meeting meetings[] = new Meeting[5];

	   

	  int x;

	  System.out.println("Enter Meetings Data:");

	  for (x=0; x<5; x++) {

	    System.out.println("Enter Specific Date:");

	    date = scanner.nextLine();

	    System.out.println("Enter Specific Place");

	    place = scanner.nextLine();

	    System.out.println("Enter Specific Topic");

	    topic = scanner.nextLine();

	     

	    meetings[x] = new Meeting();

	    meetings[x].setDate(date);

	    meetings[x].setPlace(place);

	    meetings[x].setTopic(topic);

	  }

	  System.out.println();

	  System.out.println("Display Created Meetings");

	  printArray(meetings);

	  

	  System.out.println("Number of meetings created: "+meetings.length);

	   

	  System.out.println("Saving into text file ...");

	  outputFile(meetings);

	}

}

