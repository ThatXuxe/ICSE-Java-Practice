import java.util.*;
/*
 * 1/2 + 2/3 + 4/5 + 6/7..n
 */
public class pr119
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no. of terms: ");
      int n = sc.nextInt();
      double x = 2.0;
      double sum = 0;
      System.out.println("__________________________");
      
      for(int i = 1; i<=n; i++)
      {
          double y = x-1;
          System.out.print((int)y+"/"+(int)x);
          System.out.print((i==n)?" = ":" + ");
          double res = y/x;
          sum = sum + res;
          x = findPrime(x);
      }
      System.out.print(sum);
    }
    public static double findPrime(double x)
    {
        int flag = 0, i = 2;
        x++;
        while(flag == 0)
        {
            i = 2;flag = 0;
            while(i<=x/2)
            {
                if(x%i==0)
                    flag = 1;
                i++;
            }   
            if(flag==1) 
                x++;
            else if(flag == 0)
            {
                flag = 1;
                break;
            }
            flag = 0;
        }
        return x;
    }
}