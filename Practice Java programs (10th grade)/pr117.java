import java.util.*;
/*
 * abcde
 *  abcd
 *   abc
 *    ab
 *     a
 */
public class pr117
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two alphabets: ");
      char a = sc.next().charAt(0), b = sc.next().charAt(0);
      if(b<a)
      {
          char temp = a;
          a = b;
          b = temp;
      }
      System.out.println("__________________________");
      char t = b;
      for(char i = a; i<=b; i++)
      {
          char j = a;
          for(j=a; j<i; j++)
          {
              System.out.print(" ");
          }
          for(char k = a; k<=t ; k++)
          {
              System.out.print(k);
          }
          System.out.println();
          t--;
      }
    }
}