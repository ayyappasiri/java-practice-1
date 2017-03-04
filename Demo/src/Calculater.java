
/**
 * Created by user on 2/19/2017.
 */
   public class Calculater {


    int ans;

    public void addition(int a, int b)

    {
        ans = a + b;

        System.out.println(" Addition is " + a + "  and  " + b + "  =  " + ans);
    }

    public void substraction(int a, int b) {
        ans = a - b;

        System.out.println(" Substraction is " + a + " and " + b + " = " + ans);
    }

    public static void multiplication(int a, int b) {

        Calculater m = new Calculater();

        m.ans = a * b;

        System.out.println(" multiplication is " + a + " and " + b + " = " + m.ans);
    }


    public static void division(double a, double b) {
        double d;
        d = a / b;
        System.out.println(" Division is " + a + " and " + b + " = " + d);


    }

    public static void main(String[] args)
    {
        Calculater cal = new Calculater();
        cal.addition(50, 10);
        cal.substraction(20, 10);
        Calculater.multiplication(10, 5);
        Calculater.division(5.5, 2.5);
    }


}