import java.util.*;
/*
 */
public class pr146
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String s = sc.nextLine();
      s = s.trim();
      System.out.println("______________________________________");
      if(s.length()>=1)
      System.out.print(s.charAt(0));
      for(int i = 0; i<s.length(); i++)
      {
          if(s.charAt(i)==' ')
          {
              System.out.print("."+s.charAt(i+1));
          }
      }
    }
}