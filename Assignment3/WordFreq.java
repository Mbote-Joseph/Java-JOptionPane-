package Assignment3;

/*
 * WordFreq.java
 *
 * March 20, 2007
5 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

/**
 * Reads whitespace delimited words from a file, counts the occurrences
 * of each word, and prints a sorted list of the count/word pairs.
20 *
 * @author Andy Dalton
 */
public class WordFreq {
/**
25 * Private class for storing word/count pairs and implementing
 * sorting logic.
 */
private class WordCounter implements Comparable<WordCounter> {
private String word;
private int count;
public WordCounter(String word, int count) {
 this.word = word;
 this.count = count;
 }
public void incrementCount() { ++count; }
public String getWord() { return word; }
public int getCount() { return count; }

/**
 * Compares this WordCounter to the other. Returns a positive
 * number if the WordCount is "greater than" the other, 0 if
 * the two WordCounters are "equal", and a negative number if
45 * the WordCount is "less than" the other.
 */
public int compareTo(WordCounter other) {
int value;
if (count != other.count) {
    value = other.count-count;
 } else {
 value = word.compareTo(other.word);
 }

return value;
 }
 }
/* Private State */
private String filename;
private Map<String, WordCounter> wordCountMap;

public WordFreq(String filename) {
 this.filename = filename;
 this.wordCountMap = new HashMap<String, WordCounter>();
 }

public void scanAndSort() throws FileNotFoundException {
 Scanner scanner = new Scanner(new File(filename));
 /*
 * Read words, and update their counters. Add new WordCounters
 * as necessary
 */
while (scanner.hasNext()) {
    String word = scanner.next().toLowerCase();
     WordCounter wordCounter = wordCountMap.get(word);
    if (wordCounter == null) {
     wordCounter = new WordCounter(word, 1);
    wordCountMap.put(word, wordCounter);
     } else {
     wordCounter.incrementCount();
     }
     }
    
     scanner.close();
     }
    public void print() {
     List<WordCounter> wordCounts;
     wordCounts = new ArrayList<WordCounter>(wordCountMap.values());
     Collections.sort(wordCounts);
    
    for (WordCounter i : wordCounts) {
        if(i.getCount()>=2){
            System.out.printf("%d\t%s\n", i.getCount(), i.getWord());
        }
     }
     }
    
    public static void main(String[] args) {
    try {
     WordFreq wordFreq = new WordFreq("/home/mbote-joseph/Desktop/Programming/java/Assignment3/samplefile.txt");
    wordFreq.scanAndSort();
     wordFreq.print();
     } catch (FileNotFoundException ex) {
     System.err.printf("File not found: %s\n", "samplefile.txt");
     }
    }
    }