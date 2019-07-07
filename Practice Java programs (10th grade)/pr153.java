import java.util.*;
/*
 * 1!-3!+5!-7!...n = res
 */
public class pr153
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      System.out.println("______________________________________");
      int x = 1, res = 0;
      for(int i = 1; i<=n ; i++)
      {
          int f=1;
          for(int q = 1; q<=x; q++)
          {
              f = f*q;
          }
          if(i!=n)
          {
             if(i%2==0)
             {
                 System.out.print(x + "! + ");
                 res -= f;
             }    
             else
             {
                 System.out.print(x + "! - ");
                 res += f;
             }    
          }   
          else
          {
             System.out.print(x+"!");
             res -= (i%2==0)? f : -f ;
          }   
          x = x+2; 
      }
      System.out.println(" = "+res);
    }
}