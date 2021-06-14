
import java.io.*;
import java.util.*;

public class WordFrequency {
    private String word;
    private int count=1;
    public WordFrequency(String w) {
    word = w;
    // count = 1;
    }
    public String getWord() {
    return word;
    }
    public int getCount() {
    return count;
    }
    public void incCount() {
    count++;
    }
    public static String ClearNonAlphabetic(String w) {
    String s = "";
    for (int i = 0; i < w.length(); i++) {
    char c = w.charAt(i);
    if (Character.isLetter(c)) {
    s = s + Character.toLowerCase(c);
    }
    }
    return s;
    }
    public boolean equals(WordFrequency other) {
    return word.equals(other.word);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader inFile = new BufferedReader(new FileReader("/home/mbote-joseph/Desktop/Programming/java/Assignment3/samplefile.txt"));
        ArrayList<WordFrequency> wordlist = new ArrayList<>();
        String str1, str2;
        WordFrequency wordfrequency;
    
      
        while ((str2 = inFile.readLine()) != null) {
        String arr[] = str2.split(" ");
        for (int i = 0; i < arr.length; i++) {
        str1 = WordFrequency.ClearNonAlphabetic(arr[i]);
        wordfrequency = new WordFrequency(str1);
        int j;
        for (j = 0; j < wordlist.size(); j++) {
        if (wordlist.get(j).equals(wordfrequency)) {
        break;
        }
        }
        if (j < wordlist.size()) {
        wordlist.get(j).incCount();
        } else {
        wordlist.add(wordfrequency);
        }
        }
        }
        for (int i = 0; i < wordlist.size(); i++) {
        wordfrequency = wordlist.get(i);
        if (wordfrequency.getCount() >= 2) {
        System.out.println(wordfrequency.getWord() + " " + wordfrequency.getCount());
        }
        }
        inFile.close();
        }
   }
   