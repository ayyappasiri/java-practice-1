/**
 * Created by user on 2/19/2017.
 */
        public class Temprature
              {
                   public  void temp (int F)
                   {
                       double c;
                       c = (F - 32 )* 5/9;

                          System.out.println(" if temp =" + F + " Fahranhit than temp =" + c + "celcious");

                   }

                       public static  void main (String args [])
                          {
                              Temprature t = new Temprature();
                              t.temp(20);
                          }

              }



