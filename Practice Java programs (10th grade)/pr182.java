import java.util.*;
/*
 */
public class pr182
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 2 numbers: ");
      int a = sc.nextInt(), b = sc.nextInt();
      if(a>b)
      {
          int temp = a; 
          a = b;
          b = temp;
      }
      while(b ==b)
      {
          System.out.println("Enter 1 for prime palindrome, 2 for twin prime and 3 for exit");
          int x = sc.nextInt();
          System.out.println("______________________________________");
          switch(x)
          {
              case 1:f1(a,b);
                     break;
              case 2:f2(a,b);
                     break;
              case 3:System.exit(0);
              default:System.out.println("Wrong input, try again.");
          }
      }
    }
    public static void f1(int a, int b)
    {
        for(int i = a; i<b; i++)
        {
            if(checkPrime(i)==true)
            {
                int dup = i;
                int rev = 0, d = 0;
                while(dup!=0)
                {
                    d = dup%10;
                    rev = (rev*10)+d;
                    dup = dup/10;
                }
                if(i==rev)
                {
                    System.out.println(i);
                }
            }
            i++;
        }
    }
    public static void f2(int x, int y)
    {
        for(int i = x; i<y-2; i++)
        {
            int a = i, b = i+2;
            boolean flag2 = false;
            if(checkPrime(a)==true && checkPrime(b)==true)
            {
                System.out.println(a+", "+b);
            }
        }    
    }
    public static boolean checkPrime(int x)
    {
        for(int i = 2; i<=x/2; i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
}