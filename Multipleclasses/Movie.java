package Multipleclasses;

public class Movie {
    private Actor star;
    public Actor support;
    public String title;

    public Movie(String title){
        this.title = title;
    }
    public Movie(Movie other){
        star = other.star;
        support= other.support;
        title = other.title;
    }
    public void setStar(Actor a){
        star=a;
        a.starCount +=1;
    }
    public Actor getStar(){
        return star;
    }
    public boolean equals(Movie m){
        if(title == m.title){
            return true;
        }else{
            return false;
        }
        
    }
    
}
