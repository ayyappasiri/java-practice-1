package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/26/2017.
 */
public class CitySwitch
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System .in);
        System.out.println("Enter City Name");
        String city = scanner.next();
        switch (city)
        {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                 break;
            case "C":
                System.out.println("Calcuta");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Edingbourgh");
                break;
            case "F":
                System.out.println("France");
                break;
            default:
                System.out.println("Enter city only between A to F");
        }


    }
}
