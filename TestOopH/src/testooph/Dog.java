/*
Caroline Hsu - 12/17/20
This project models abstraction in OOP (object oriented programming)
 */
package testooph;

public class Dog
{
  // data fields or attributes
  private String name;
  private int age;
  private String color;
  public static int noDogs = 0;
      
  // constructor: Public, no return type, same name is class name
  // it constructs objects and is used to initialize data fields
  public Dog(String n, int a, String color)
  {
    // use this for object or else will register as parameter for method
    this.name = n;
    this.age = a;
    this.color = color;
    noDogs++;
  }
  
  // overloading the constructor
  public Dog()
  {
    this.name = "";
    this.age = 0;
    this.color = "";
    noDogs++;
  }
  
  // accessor or getters
  public String getName()
  {
    return this.name;
  }
  public int getAge()
  {
    return this.age;
  }
  public String getColor()
  {
    return this.color;
  }
  
  // mutator or setter for Name
  public void setName(String name)
  {
    this.name = name;
  }
  public void setAge(int age)
  {
    this.age = age;
  }
  public void setColor(String color)
  {
    this.color = color;
  }
  
  @Override
  public String toString()
  {
    String objectValues = "The name is " + this.name +
                          " the age is " + this.age +
                          " the color is " + this.color;
    return objectValues;
  }
  
  // method or behavior
  public void barking()
  {
    System.out.println("woof woof");
  }
  
  public static void main(String[] args)
  {
    System.out.println("Class no. of dogs: " + Dog.noDogs);
    // constructing object:
    // ClassName objectName = new Constructor(parameters)
    Dog henrysDog = new Dog("Kahali", 1, "Black");
    System.out.println("Henry's dog is: " + henrysDog.name 
                        + ", " + 
                        henrysDog.age + 
                        " years old, and is " + 
                        henrysDog.color);
    System.out.println("Class no. of dogs: " + Dog.noDogs); // 0
    System.out.println("Henry no. of dogs: " + henrysDog.noDogs); // 1
    // using objectName
    // henrysDog.barking();
    Dog riemesDog = new Dog();
    System.out.println("Rieme's dog is " + riemesDog.name);
    
    System.out.println("Class no. of dogs: " + Dog.noDogs); // 2
    System.out.println("Henry no. of dogs: " + henrysDog.noDogs); // 2
    System.out.println("Rieme no. of dogs: " + riemesDog.noDogs); // 2
    // riemesDog.name = "Idunno";
    // System.out.println("Rieme's dog is " + riemesDog.name);

    Dog isaacDog = new Dog("Glitter", 4, "white");
    System.out.println("Class no. of dogs: " + Dog.noDogs); // 3
    System.out.println("Henry no. of dogs: " + henrysDog.noDogs); // 3
    System.out.println("Rieme no. of dogs: " + riemesDog.noDogs); // 3
    System.out.println("Isaac no. of dogs: " + isaacDog.noDogs); // 3
    
    System.out.println("Value of isaacDog is " + isaacDog);
        
  }
  
}
