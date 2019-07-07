import java.util.*;
/*
 * abcdefg
 *  bcdef
 *   cde
 *    d
 */
public class pr121
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no. rows");
      int n = sc.nextInt();
      char a = 'a', b = 'a';
      char s = 'a', x = (char)(97+(n*2)-1);
      System.out.println("__________________________");
      for(int i = 1; i<=n; i++)
      {
          a = b;
          for(char j = 'a'; j<=s; j++)
          {
              System.out.print(" ");
          }
          s++;
          for(char j = 'a'; j<x; j++)
          {
              System.out.print(a);
              a++;
          }
          x--;x--;
          System.out.println();
          b++;
      }
    }
}