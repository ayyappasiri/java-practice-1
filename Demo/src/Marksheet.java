import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by user on 2/19/2017.
 */
public class Marksheet
{

        public static void main (String args[])
    {
        int mark = -2;
        if (mark > 100)
           {
            System.out.println("marks should not be more than 100");
            }else  if ( mark <= 100 & mark >= 70)
                 {
                      System.out.println(" distinsion ");
                 }  else if (mark <=69 & mark >=60 )

                        {
                            System.out.println(" firstclass ");

                         } else if (mark <= 59 & mark >= 35)

                                {
                                  System.out.println(" passclass ");


                                 }else if (mark<=34 & mark >= 0)
                                     {
                                        System.out.println(" fail ");
                                        } else
                                            {
                                                System.out.println("mark should not be  negative ");
                                            }
















    }
}
