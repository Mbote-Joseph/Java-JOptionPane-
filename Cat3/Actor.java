package Cat3;

public class Actor {
    private String name;
    private int yob;
    public int starCount;
    
    public Actor(String n, int y){
        name=n;
        yob=y;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return yob;
    }
    public String toString(){
        String str= name + yob;
        return str;
    }

    public class Movie{
        private String star;
        public String support;
        public String title;

        // Actor a = new Actor();

        // public Movie(String t) {
        //     title =t;
   
        }
        
        


    public static void main(String[] args){
        Actor A1= new Actor("adam", 1990);
        Actor A2= new Actor("Sally", 1980);

       
        Actor actorArray[]=new Actor[10];
    
      
        int count=0;
        for(int i=0;i<actorArray.length;i++){
            // actorArray .getAge();

            count ++;
        }
        
            
                
       
    }
        
    }
    


