import java.util.*;
/*
 * 2!+3!+5!+7!+11!+13!...n
 */
public class pr148
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      int sum = 2, a = 2;  
      System.out.println("______________________________________");
      System.out.print("2");
      for(int i = 1; i<n; i++)
      {
         a = nextPrime(a);
         int x = doFactorial(a);
         sum += x; 
         System.out.print("+"+x);
      }
      System.out.println(" = "+sum);
    }
    public static int nextPrime(int a)
    {
        int x = a;
        int d = 0;
        int flag = 1;
        while(flag != 0)
        {
            int i = 2;
            x++;
            d = 0;
            while(i<=x/2)
            {
                if(x%i==0)
                {
                    d++; 
                }
                i++;
            }
            if(d>0)
                flag = 1;
            else
                flag = 0;
        }
        return x;
    }
    public static int doFactorial(int a)
    {
        int fact = 1;
        for(int i = 1; i<=a; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
}