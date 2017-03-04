package Homework2;

import java.util.Scanner;

/**
 * Created by user on 3/1/2017.
 */
public class FloydsTriangle4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Floyds Triangl");
        int rows=sc.nextInt();
        int a=1;
        System.out.println("************");
        for(int i=1;i<=rows;i++)
        {
            for(int b=1;b<=i;b++)
            {
                System.out.print(" "+ a++);
            }
            System.out.println();
        }
    }
}
