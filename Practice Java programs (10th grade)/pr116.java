import java.util.*;
/*
 * a d
 * dcba
 *  dcb
 *   dc
 *    d
 */
public class pr116
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter two nubers: ");
      char a = sc.next().charAt(0), b = sc.next().charAt(0);
      char temp;
      if(b<a)
      { 
          temp = a; 
          a = b;
          b = temp;
      }
      int r = (int)b-(int)a ;
      temp = b;
      System.out.println("__________________________");
      for(char i = a; i<=b; i++)
      {
          for(char j = a; j<i; j++)
          {
              System.out.print(" ");
          }
          for(char k = b; k>=i ; k--)
          {
              System.out.print(k);
          }
          System.out.println();
      }
    }
}