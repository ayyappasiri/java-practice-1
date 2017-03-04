import java.util.Scanner;

/**
 * Created by user on 2/25/2017.
 */
public class Cityname {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter city name ");

        String cityName = sc.nextLine();

//               if (Cityname == "London");
//               {
//
//                   System.out.println(" You are in UK");
//
//               } else if ("Cityname"= "NewDelhi") ;
//               S8ystem.out.println("You are in  india");

        if (cityName.equals("London"))
        {
            System.out.println("You are in UK");
        } else if (cityName.equals("New Delhi"))
            {
            System.out.println("You are in India");
            } else if (cityName.equals("Tokyo"))
                {
                System.out.println("You are in Japan");
                } else if (cityName.equals("NewYork")) {
                System.out.println("You are in US");
                }else {
            System.out.println("nor in valid area");
        }


    }

}

















