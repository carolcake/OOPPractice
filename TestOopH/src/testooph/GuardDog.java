/*
 *  Caroline Hsu - 1/14/21
 */
package testooph;

public class GuardDog extends Dog // this makes it a subclass
{
  private String licenseNo;

  public GuardDog(String name, int age, String color, String licenseNo)
  {
    super(name, age, color);
    this.licenseNo = licenseNo;
  }
  
  /*
  overloading constructor with no parameters
  public GuardDog(String licenseNo)
  {
    super();
    this.licenseNo = licenseNo;
  }
  */
  
  @Override
  public void barking()
  {
    // if you call the super, it will call the parent class and use the
    // method too, if you use both, it will be the main class and subclass
    // super.barking(); 
    System.out.println("Growling");
  }

  public static void main(String[] args)
  {
    System.out.println(GuardDog.noDogs);
    // object is lowercase
    GuardDog monster = new GuardDog("Angry", 4, "Brown", "324E");
    // GuardDog monster = new GuardDog("324E");
    System.out.println("The name is: " + monster.getName());
    System.out.println(monster);
    monster.barking();
  }
}
