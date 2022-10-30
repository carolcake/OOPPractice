/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testoope;

// inherit everything the Dog class has
// has three attributes so you inherit it so both classes have 3 attributes
public class GuardDog extends Dog
{
  private String breed;
  public GuardDog (String breed, String name, int age, String color)
  {
    super(name, age, color);
    this.breed = breed;
    // this.datafield = parameter  
  }
  
  @Override
  public void barking()
  {
    super.barking();
    System.out.println("rrrrr");
  }
  
  public String getBreed()
  {
    return this.breed;
  }
  public void setBreed(String breed)
  {
    this.breed = breed;
  }
  
  public static void main(String[] args)
  {
    GuardDog gdObj = new GuardDog("GS", "Joe", 3, "Brown");
    gdObj.barking();
  }
}
