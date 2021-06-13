package Assignment3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
*
* @author pc
*/
class WordFrequency {

//getter ,to get word
public String getWord() {
return word;
}
//get count
public int getCount() {
return count;
}
//data members
private String word;
private int count;
public WordFrequency(String wf)
{
//the constructor – sets the word, initialize count = 0
word=wf;
count=0;
}
public void incCount()
{
//increment the count
count++;
}
}
class TextFile
{
public static void main(String[] args) {
try{
int i;
ArrayList<WordFrequency> wordList=new ArrayList<WordFrequency>();//arraylist to store the list of words
File f=new File("./samplefile.txt");//open file
Scanner sc=new Scanner(f);
//iterate until file has no more words
while(sc.hasNext())
{
String word=sc.next();//read a word from file
//check for all the word stored in wordList if the word is same as that one
for(i=0;i<wordList.size();i++)
{
//if word is present then increse count and break out of the loop
if(wordList.get(i).getWord().equals(word))
{
wordList.get(i).incCount();
break;
}
}
//if word is not found then add word to wordlist and make count as one
if(i==wordList.size())
{
WordFrequency wf=new WordFrequency(word);
wf.incCount();//increase count by 1 because intially
wordList.add(wf);//add the word in wordList
}
}
boolean found=false;//to track whether we found any word with frequency atleast 24
for(i=0;i<wordList.size();i++)
{
if(wordList.get(i).getCount()>=24)//if count is atleast 24
{
if(found==false)//if this is the first word in the list then print a message also
{
System.out.println("All the words in the file having frequency atleast 24 : ");
System.out.println("Word\tFrequency");
}
System.out.println(wordList.get(i).getWord()+" - "+wordList.get(i).getCount());//print word with count
found=true;//found word
}
}
//if no word found then give a message
if(found==false){
System.out.println("No word has frequency atleast 24");
}
  
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}