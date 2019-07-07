import java.util.*;
/*
 * india is my country
 * country my is india
 */
public class pr159
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String s = sc.nextLine().trim();
      s = " " + s;
      int x = s.length();
      System.out.println("______________________________________");
      for(int i = s.length()-1; i>=0; i--)
      {
          if(s.charAt(i)==' ')
          {
              System.out.print(s.substring(i+1,x)+" ");
              x = i;
          }
      }
    }
}