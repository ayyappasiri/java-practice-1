package Homework2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by user on 2/26/2017.
 */
public class Salary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Employee Name\t: ");
        String name =scanner.next();
        System.out.print(" Enter Employee ID \t:");
        int id= scanner.nextInt();
        System.out.print(" Enter Employee  Basic Salary\t: ");
        double BS=scanner.nextDouble();

        double HRA = BS*10/100;
        double DA  = BS*8/100;
        double TA  = BS*9/100;
        double PF  = BS*20/100;
        double Grosssalary=BS+HRA+DA+TA-PF;

        System.out.println("\n\t\t Salary Sleep");
        System.out.println("\n========================================================");
        System.out.println("\n\tEmployee name\t\t:"+name);
        System.out.println("\n\tEmployee ID\t\t:"+id);
        System.out.println("\n========================================================");
        System.out.println("\n\tBasic Salary\t\t:"+BS);
        System.out.println("\nHRA\t\t:"+HRA);
        System.out.println("\n\tDA\t\t:"+DA);
        System.out.println("\n\tTA\t\t:"+TA);
        System.out.println("\n\tPF\t\t:"+PF);
        System.out.println("\n\tGrosssalary\t\t:"+Grosssalary);

    }
}