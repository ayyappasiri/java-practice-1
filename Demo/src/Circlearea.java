/**
 * Created by user on 2/19/2017.
 */
             public class Circlearea
                 {


                     static final double pi = 3.14;

                          public void radious ( double r)

                            {
                                 double area;
                                 area = pi * r * r;
                                 System.out.println ("area of circle" + area);
                            }
                                     public static void main (String args[])
                                          {
                                                Circlearea c = new Circlearea();
                                                 c.radious(5.5);

                                          }

                 }
