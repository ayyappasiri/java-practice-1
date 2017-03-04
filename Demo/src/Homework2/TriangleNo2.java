package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/28/2017.
 */
public class TriangleNo2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Numbers of Rows");
        int a = sc.nextInt();

        for (int i = 1 ; i<=a ;i++)
        {
            for (int k = a; k>=i; k--)
            {
                System.out.print(" ");

            }
            for(int j = 1 ; j<=i;j++)
            {
                System.out.print(" ");

                System.out.print(j);
            }
            System.out.println();
        }

    }
}
