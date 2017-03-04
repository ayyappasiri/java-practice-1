package Homework2;

/**
 * Created by user on 2/27/2017.
 */
public class DivisionBy3And5
{
    public static void main(String[] args)
    {
        System.out.println("Divide by 3 :");

        for (int a=1; a<=100;a++)
        {
            if (a % 3 ==0)
            {
                System.out.print(" "+a);

            }
        }

        System.out.println("\n Divide by 5 :");

        for (int a=1; a<=100;a++)
        {
            if (a % 5 ==0)
            {
                System.out.print(" "+a);

            }
        }

    }
}
