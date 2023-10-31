import java.util.Arrays;
import java.util.Scanner;
public class Doggies
{
    private Dog[] pups;
   
   
    public Doggies(int size)
    {
       
        Scanner keyboard = new Scanner(System.in);
       
       
        pups = new Dog[size];
       
        for (int i = 0; i < pups.length; i++ )
        {

        pups[0] = new Dog(keyboard.nextInt() ,keyboard.next());
       
            //read in age and name of the dog
             
            System.out.println("\n");
            System.out.print("Enter the age : "  );
            int age = keyboard.nextInt();
           
            System.out.print("Enter the name : " );
            String name = keyboard.next();
            System.out.println("\n");

           
           
           
           
        }
       
    }
   
    public void setDog(int spot, int age, String name)
    {
        //put a new Dog in the array at spot
        Scanner keyboard = new Scanner(System.in);
       
     
       
         Dog[] spotter = new Dog[spot];
         
         for (int i =0; i<spotter.length; i++)
         {
             
         }
         
         
        //make sure spot is in bounds
       
       
    }
    public String getNameOfOldest()
    {
        return null;
    }
    public String getNameOfYoungest()
    {
        return null;
    }
    public String toString()
    {
        return ""+ Arrays.toString(pups);
    }
}
