
public class WordFrequency {
    private String word;
    private int count;
    public WordFrequency(String w) {
    word = w;
    count = 1;
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
    public boolean equals(WordFrequency w) {
    return word.equals(w.word);
    }
   
   }
   