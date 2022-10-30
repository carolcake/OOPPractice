/*
 *  Caroline Hsu - 1/13/21
 */
package purses;

public class PursesClient
{
  public static void main(String[] args)
  {
  Purses burberryPurse = new Purses();
  System.out.println("The Burberry purse is: " + 
                     burberryPurse.getColor());
  burberryPurse.setColor("Pink");
  System.out.println("The Burberry purse is now: " + 
                     burberryPurse.getColor());
  }
}
