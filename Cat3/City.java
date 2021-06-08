 package Cat3;

public class City
{
    
    private String name;
    private int population;
    
    City(String name,int population)
    {
   
    this.name=name;
    this.population=population;
    }
   
    public String getName()
    {
    return name;
    }
    public int getPopulation()
    {
    return population;
    }
    
    public void setName(String name)
    {
    this.name=name;
    }
    public void setPopulation()
    {
    this.population=population;
    }
    }

    class Country extends City
    {
    
    private City capital;
    private double population;
  
    Country(String name,int population,City capital,double area)
    {
    super(name,population);
    this.capital=capital;
    this.population=area;
    }
    
    public double getPercentage()
    {
   
    double percentage= (this.population/super.getPopulation())*100;
    return percentage;
    }




    public static void main(String args[])
    {
    City c=new City("Abu Dhabi",1450000);
    
    Country c1=new Country("UAE",9777000,c,1450000);
    System.out.println("Percentage of people living in Abu Dhabi compared to UAE population is "+c1.getPercentage());
    }
}

