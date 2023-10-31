import java.util.Arrays;
import java.util.Scanner;
public class DoggiesRunner
{
    public static void main( String[] args )
    {
       
        int size;
       
        Scanner keyboard = new Scanner(System.in);
       
        System.out.print("How many Dogs are in the pack? :: "  );
        size = keyboard.nextInt();
       
        Doggies pack = new Doggies(size);
       
       
        System.out.println("pack :: " + pack);
        System.out.println("NAME OF OLDEST :: " + pack.getNameOfOldest());
        System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());
       

       
    }
}
