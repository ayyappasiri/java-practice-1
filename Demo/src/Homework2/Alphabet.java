package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/26/2017.
 */
public class Alphabet
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Alphabet");
        String city = scanner.next();

          if(city .equalsIgnoreCase("A"))
        {
            System.out.println("Ahmedabad");

        } else if (city.equalsIgnoreCase("B"))
                        {
                            System.out.println("Bombay");

                        }  else if (city.equalsIgnoreCase("C"))
                        {
                            System.out.println("Calcuta");

                        }else if(city.equalsIgnoreCase("D"))
                        {
                            System.out.println("Delhi");
                        }else if(city.equalsIgnoreCase("E"))

                           {
                               System.out.println("Edingbourgh");
                           }else if (city.equalsIgnoreCase("F"))
                                {
                                    System.out.println("France");
                                }else
                                    {
                                        System.out.println("input not vallid");
                                    }




    }
}
