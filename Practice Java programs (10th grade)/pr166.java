import java.util.*;
/*india
 * ni
 */
public class pr166
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String s = sc.nextLine().trim() + " ";
      System.out.println("______________________________________");
      String w = "";
      for(int i = 0; i<s.length(); i++)
      {
          if(s.charAt(i)!=' ')
          {
              w = s.charAt(i) + w;
          }
          else
          {
              System.out.print(w+" ");
              w = "";
          }
      }
    }
}