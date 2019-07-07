import java.util.*;
/*
 * india
 *  ind
 *   i
 *   
 */
public class pr145
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = sc.nextLine();
      System.out.println("______________________________________");
      int x = 0;
      System.out.println("______________________________________");
      for(int i = s.length(); i>=0; i-=2)
      {
          for(int j = 1; j<=x; j++)
             System.out.print(" ");
          for(int j = 0; j<i; j++)
          {
              System.out.print(s.charAt(j));
          }
          x++;
          System.out.println();   
      }
    }
}