import java.util.*;
/*
 *     a
 *    bb
 *   ccc
 *  dddd
 * eeeee 
 */
public class pr118
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter alphabets: ");
      char a = sc.next().charAt(0), b = sc.next().charAt(0);
      System.out.println("__________________________");
      for(char i = a; i<=b ;i++)
      {
          for(char j = b; j>i; j--)
          {
              System.out.print(" ");
          }
          for(char k = a; k<=i; k++)
          {
              System.out.print(i);
          }
          System.out.println();
      }
    }
}