/**
 * Created by user on 2/19/2017.
 */
public class Smallestnumber
               {
                   public static void sn(int x, int y,int z)
                   {
                       if (x<y & x<z)
                               {
                                   System.out.println("The smallest number is=" +x);

                               } else  if (y<z & y<x)

                                         {

                                             System.out.println("The Smallest number is=" +y);

                                         }else  if (z<x & z<y)

                                             {

                                                 System.out.println("The smallest number is =" +z);

                                             }
                   }
                                                 public static void main (String arg [])

                                                 {

                                                     Smallestnumber.sn(55,35,45);

                                                 }


               }
