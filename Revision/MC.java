package Revision;

public class MC{
    //variables
    public int x;
        
    //methods
    public MC(int v){
       this.set(v);
    }
    public void set(int v){
       this.x = v;
    }
    public MC inc(){
      x++;
      return this;
    }
   }