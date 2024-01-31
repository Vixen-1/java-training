package effigo.ayushi.java.oops;


import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // copy constructor: if we want to copy the values of one object to another its not possible. nay change made in one will be made in another automaticaly.
    // so to avoid this we use copy constructor so that we can have two same objects without same reference.
    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    // getter function: using them we can access private members of a class. so that we don't change it accidently.
    public String getMake(){
        return make;
    }
    public double getPrice(){
        return price;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    } 

    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }
    //setters:: to set te values of private fields.

    public void setMake(String make){
        this.make = make;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    } 
    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    
    // to string method
    public String toString(){
        return "Make: " + this.make + ".\n"
        + "Price: " + this.price + ".\n"
        + "Year: " + this.year + "\n"
        + "Color: " + this.color + "\n"
        + "Parts: " + Arrays.toString(parts) + "\n";
    }
    }
