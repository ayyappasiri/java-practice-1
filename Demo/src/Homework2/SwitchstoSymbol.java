package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/27/2017.
 */
public class SwitchstoSymbol
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter num1");
        int num1=scanner.nextInt();
        System.out.println(" Enter num2");
        int num2=scanner.nextInt();
        System.out.println("Enter Symbol +,-,/,*");
        String symbol= scanner.next();
        switch (symbol)

        {
            case "+":
                System.out.println("addition num1 and num2 :" +(num1 + num2));
                break;

            case "-":
                System.out.println(" substraction num1 and num2 :" + (num1 - num2));
                break;

            case"*":
                System.out.println("multiplication num1 and num2 :"+(num1 * num2));
                break;

            case"/":
                System.out.println("division num1 adn num2 :"+(num1 / num2));
                break;

            default:
                System.out.println("invalid symbol");
        }
    }
}
