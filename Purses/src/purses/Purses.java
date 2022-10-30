/*
Caroline Hsu - 01/12/2021

 */
package purses;

public class Purses
{

  // data fields or attributes
  private String brand;
  private String color;
  private String size;
  public static int numberPurses = 0; // number of purses

  // constructor: Public, no return type, same name is class name
  // it constructs objects and is used to initialize data fields
  public Purses(String b, String c, String s)
  {
    // use this for object or else will register as parameter for method
    this.brand = b;
    this.color = c;
    this.size = s;
    numberPurses++;
  }

  // other constructor that's public with no parameters
  public Purses()
  {
    this.brand = "";
    this.color = "";
    this.size = "";
    numberPurses++;
  }

  // accessor or getters
  public String getBrand()
  {
    return this.brand;
  }

  public String getColor()
  {
    return this.color;
  }

  public String getSize()
  {
    return this.size;
  }

  // mutator or setter 
  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setSize(String size)
  {
    this.size = size;
  }

  // toString overrides the object address and shares the object values instead
  public String toString()
  {
    String objectValues = "the brand is " + this.brand
        + ", the color is " + this.color
        + ", the size is " + this.size;
    return objectValues;
  }

  // method or behavior
  public void holding()
  {
    System.out.println("we hold your things for you!");
  }

  public static void main(String[] args)
  {
    // constructing the objects
    Purses chanelPurse = new Purses("Chanel", "black", "small");
    System.out.println("The value of your Chanel purse: " + chanelPurse);
    // use toString to print the attributes of the object (shows address)
    System.out.println("The number of purses I have: " + numberPurses);
    Purses versacePurse = new Purses("Versace", "brown", "large");
    System.out.println("The value of your Versace purse: " + versacePurse);
    System.out.println("The number of purses I have: " + numberPurses);
    Purses goyardPurse = new Purses("Goyard", "blue", "medium");
    System.out.println("The value of your Goyard purse: " + goyardPurse);
    System.out.println("The number of purses I have: " + numberPurses);
    System.out.println("what do purses do?");
    goyardPurse.holding();
  }

}
