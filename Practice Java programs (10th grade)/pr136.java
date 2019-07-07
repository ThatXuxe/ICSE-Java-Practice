import java.util.*;
/*
 * india
 * ndia
 * dia
 * ia
 * a
 */
public class pr136
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = sc.nextLine();
      System.out.println("______________________");
      for(int i = 0; i<s.length(); i++)
      {
          for(int j = i; j!=(s.length()-1); j++)
              System.out.print(s.charAt(j));
          System.out.print(s.charAt(s.length()-1));    
          System.out.println();    
      }
    }
}