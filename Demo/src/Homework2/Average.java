package Homework2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by user on 2/26/2017.
 */
public class Average
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Value 1\t\t:");
        int a= scanner.nextInt();
      //  System.out.println("Enter Value 2\t\t:");
        int b= scanner.nextInt();
       // System.out.println("Enter Value 3\t\t:");
        int c= scanner.nextInt();
       // System.out.println("Enter Value 4\t\t:");
        int d=scanner.nextInt();
    //    System.out.println("Enter Value 5\t\t:");
        int f=scanner.nextInt();
        double averge=a+b+c+d+f/5;

        System.out.println("Average = "+averge);

    }
}
