/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testoope;

public class Dog
{

  private static String name; // public = other classes can access
  private int age;
  private String color;

  public Dog(String name, int age, String color)
  {
    // parameters same as datafields
    this.name = name; // use this for the datafield name
    this.age = age;
    this.color = color;
  }

  public Dog() // useful for no datafields, empty constructor
  {
    this.name = "";
    this.age = 0;
    this.color = "";
  }

  // get and set methods
  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getAge()
  {
    return this.age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public String getColor()
  {
    return this.color;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  @Override
  public String toString()
  {
    String msg = "My dog's name is " + this.name + " and my dog's age is " +
        this.age;
    return msg;
  }

  public void barking() // static belongs to everyone
  // can just use class name to access data object/method
  // object is an instance of the class
  {
    System.out.println("Woof woof!");
  }

  public static void main(String[] args)
  {
    // Dog.barking();
    Dog dogObj = new Dog("Snoopy", 13, "white"); // camelCase
    // create dogObj with constructor Dog same as class name
    Dog dogObj2 = new Dog();
    System.out.print(dogObj.name);
    dogObj2.name = "mcv";
    System.out.println(dogObj2.name);
    System.out.println(dogObj.name);
    System.out.println(dogObj);
    dogObj.barking();
  }

}
