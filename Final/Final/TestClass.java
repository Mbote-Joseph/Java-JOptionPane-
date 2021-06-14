import java.io.*;
import java.util.*;

   public class TestClass {
    public static void main(String[] args) throws IOException {
    BufferedReader inFile = new BufferedReader(new
   FileReader("/home/mbote-joseph/Desktop/Programming/java/Assignment3/samplefile.txt"));
    ArrayList<WordFrequency> wordlist = new ArrayList<>();
    String str, str2;
    WordFrequency wordfreq;

  
    while ((str2 = inFile.readLine()) != null) {
    String arr[] = str2.split(" ");
    for (int i = 0; i < arr.length; i++) {
    str = WordFrequency.ClearNonAlphabetic(arr[i]);
    wordfreq = new WordFrequency(str);
    int j;
    for (j = 0; j < wordlist.size(); j++) {
    if (wordlist.get(j).equals(wordfreq)) {
    break;
    }
    }
    if (j < wordlist.size()) {
    wordlist.get(j).incCount();
    } else {
    wordlist.add(wordfreq);
    }
    }
    }
    for (int i = 0; i < wordlist.size(); i++) {
    wordfreq = wordlist.get(i);
    if (wordfreq.getCount() >= 2) {
    System.out.println(wordfreq.getWord() + " " + wordfreq.getCount());
    }
    }
    inFile.close();
    }
   }