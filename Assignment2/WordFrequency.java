package Assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
  
   //these are instance variables
   String word;
   int count;
  
   //the constructor sets the word and initilize the count with 1
   public WordFrequency(String word) {
       this.word = word;
       count = 1;
   }

   //to get the word
   public String getWord() {
       return word;
   }

   //to get the count
   public int getCount() {
       return count;
   }
  
   //to increment the count
   public void incCount(){
       count++;
   }
  
   //to clear non alphabetic words
   public String clearNonAlphabetic(String str){
       return "";
   }

   public static void main(String[] args) {
       //map for to store frequency of each word which is coming from file
       Map<String, Integer> map = new HashMap<>();
      
       //this is file where we take input
       File file = new File("1.txt");
      
       //traversing file putting each to word to map incremting the particular count
   try {
   Scanner sc = new Scanner(file);
   while (sc.hasNext()) {
   String w = sc.next();
   Integer n = map.get(w);
       n = (n == null) ? 1 : ++n;
       map.put(w, n);
   }
   sc.close();
  
   //printing the results to output
   for (Map.Entry<String,Integer> entry : map.entrySet())
   System.out.println(entry.getKey() + " - " + entry.getValue());
   }
   catch (FileNotFoundException e) {
   e.printStackTrace();
   }
  
   }
}



