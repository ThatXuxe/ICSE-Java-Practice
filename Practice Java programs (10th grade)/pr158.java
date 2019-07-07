import java.util.*;
/* india
 *  indi
 *   ind
 *    in
 *     i
 *     
 */
public class pr158
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word");
      String s = sc.nextLine();
      System.out.println("______________________________________");
      for(int i = 0 ; i<s.length() ; i++)
      {
          for(int j = 0; j<i ; j++)
          System.out.print(" ");
          for(int j = 0; j<s.length()-i; j++)
          System.out.print(s.charAt(j));
          System.out.println();
      }    
    }
}