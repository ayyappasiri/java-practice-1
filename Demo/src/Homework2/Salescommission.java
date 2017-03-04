package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/26/2017.
 */
public class Salescommission
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Seller Name\t:");
        String name = scanner.next();

        System.out.print("Enter Seller id\t:");
        int id = scanner.nextInt();

        System.out.print("Enter Sales Amount\t:");
        int sales = scanner.nextInt();

        System.out.print("Enter Salary\t:");
        int salary = scanner.nextInt();

        double salesCommission=0;
      //  double total;

        if (sales >= 50000)
        {
            salesCommission = (sales * 35 / 100);

             } else if (sales >= 30000)

                 {
                    salesCommission = (sales * 20 / 100);

                          }else if (sales>=20000)

                                {
                                       salesCommission = (sales* 10/100);

                                     }else if (sales>=10000)
                                             {
                                                salesCommission = (sales* 5/100);

                                             }else if(sales<=10000)
                                                {
                                                    salesCommission =(sales*2/100);
                                                }

             double total=salary+salesCommission;



        System.out.println("=========================================================");
        System.out.println("\n\t\t Salary Sleep");
        System.out.println("\n========================================================");
        System.out.println("\n\tEmployee name\t\t:"+name);
        System.out.println("\n\tEmployee ID\t\t:"+id);
        System.out.println("\n========================================================");
        System.out.println("\n\tBasic Salary\t\t:"+salary);
        System.out.println("\n\tsalesCommission\t:"+salesCommission);
        System.out.println("\n\ttotal=\t:"+ total);




    }
}








