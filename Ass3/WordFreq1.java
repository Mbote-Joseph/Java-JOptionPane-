package Ass3;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFreq1 {
  
   //these are instance variables
   String word;
   int count;
  
   //the constructor sets the word and initilize the count with 1
   public WordFreq1(String word) {
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
    //    File file = new File("1.txt");

    try{
        BufferedReader file = new BufferedReader(new FileReader("data.in"));
            
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
    catch(IOException e) {}
   }

}

