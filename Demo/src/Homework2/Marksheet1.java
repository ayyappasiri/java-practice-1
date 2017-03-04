package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/26/2017.
 */
public class Marksheet1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Student Name\t:" );
        String name = scanner.next();
        System.out.print(" Enter Student Rollno\t:" );
        int rollno = scanner.nextInt();
        System.out.print(" Enter Maths Marks\t:" );
        int maths = scanner.nextInt();
        System.out.print(" Enter English Marks\t:" );
        int english = scanner. nextInt();
        System.out.print("Enter Science Marks\t:" );
        int science = scanner.nextInt();
        int total = maths+science+english;
        int percentage= total/3;
        System.out.print("\n\n\t\t Marksheet");
        System.out.println("\n------------------------------------------");
        System.out.print("\n\t Name \t\t:\t "+name);
        System.out.print("\n\t Rollno \t\t:\t " +rollno );
        System.out.println("\n------------------------------------------");
        System.out.println("\n\tSubjects\t:\tMarks");
        System.out.println("\n------------------------------------------");
        System.out.print("\n\t maths\t\t:\t " + maths);
        System.out.print("\n\t english\t\t:\t " + english);
        System.out.print("\n\t science\t\t:\t"+ science);
        System.out.println("\n------------------------------------------");
        System.out.print("\n\t total\t\t:\t"+ total);
        System.out.print("\n\t percentage\t\t:\t "+percentage );


        if (maths<35 || english<35 || science<35)


        {
            System.out.println("\n\t pass/fail\t:\t fail");

        }else {
            System.out.println("\n\tpass/fail\t:\tpass");


            if (percentage >= 80) {
                System.out.println("\n\tGrade\t\t:\t A+");
            } else if (percentage >= 60) {
                System.out.println("\n\tGrade\t\t:\tA");

            } else if (percentage >= 50) {
                System.out.println("\n\tGrade\t\t:\tB");

            } else if (percentage >= 35) {
                System.out.println("\n\tGrade\t\t:\t C");
            }
        }
    }

}















