package oom_project;

public class Dustbin {
    public int id;    
    public String location; 
    public double width; 
    public double height; 
    public int level; 
    public String lastEmptyDate; 

    public void setId(int n) 
    { 
        this.id = n; 
    }
    public void setLocation(String n) 
    { 
        this.location = n; 
    }
    public void setWeight(double n) 
    { 
        this.width = n; 
    }
    public void setHeight(double n) 
    { 
        this.height = n; 
    }
    public void setLevel(int n) 
    { 
        this.level = n; 
    }
    public void setLastEmptyDate(String n) 
    { 
        this.lastEmptyDate = n; 
    }
    public void display() 
    {   
        System.out.println("Van Last Empty Date is: "+ lastEmptyDate); 
        System.out.println("Van id is: "+ id); 
        System.out.println("Van location is: "+ location); 
        System.out.println("Van width is: "+ width); 
        System.out.println("Van height is: "+ height); 
        System.out.println("Van level is: "+ level); 
    } 
}
