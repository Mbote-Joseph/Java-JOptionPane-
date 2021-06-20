import java.util.input;

import java.io.FileWriter;  

import java.io.IOException;  

public class Main{
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

	  Scanner input = new Scanner(System.in);  

    String date;

    String place;

    String topic;

	  Meeting meetings[] = new Meeting[5];
        int i;

	  System.out.println("Enter Meetings Data:");

	  for (i =0; i<5; i++) {

	    System.out.println("Enter Specific Date:");

	    date = input.nextLine();

	    System.out.println("Enter Specific Place");

	    place = input.nextLine();

	    System.out.println("Enter Specific Topic");

	    topic = input.nextLine();

	     

	    meetings[i] = new Meeting();

	    meetings[i].setDate(date);

	    meetings[i].setPlace(place);

	    meetings[i].setTopic(topic);

	  }

	  System.out.println();

	  System.out.println("Display Created Meetings");

	  printArray(meetings);

	  

	  System.out.println("Number of meetings created: "+meetings.length);

	   

	  System.out.println("Saving into text file in the file meetingdata.txt");

	  outputFile(meetings);

	}

}





public class Meeting {

  private String date;

  private String place;

  private String topic;


  public String getDate(){

    return date;

  }

  public void setDate(String dateValue) {

    date = dateValue;

  }

  public String getPlace(){

    return place;

  }
 public void setPlace(String placeValue) {

    place = placeValue;

  } 

   public String getTopic(){

    return topic;

  }

  public void setTopic(String topicValue) {

    topic = topicValue;

  } 

}