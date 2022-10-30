/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testooph;

public class DogClient
{
  public static void main(String[] args)
  {
    Dog abhinavsDog = new Dog();
    System.out.println("Abhinav's dog is " + 
                       abhinavsDog.getName());
    abhinavsDog.setName("Swami");
    System.out.println("Abhinav's dog is " + 
                       abhinavsDog.getName());
  }
}
