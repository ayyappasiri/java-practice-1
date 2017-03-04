import java.util.Scanner;

/**
 * Created by user on 2/25/2017.
 */
public class test3

                 {
                     public static void main (String args[])
                     {
                         Scanner number = new Scanner(System.in);
                         System.out.println("Enter number ");
                         int a = number.nextInt();
                         int result = a%2;
                         System.out.println( result);

                         if (a<= -1)
                         {
                             System.out.println(" not valid numbe");
                         }
                         if (result == 0)
                         {
                             System.out.println(a + "number is even");

                         } else
                             System.out.println(a+ "number is odd");

                     }




                 }

