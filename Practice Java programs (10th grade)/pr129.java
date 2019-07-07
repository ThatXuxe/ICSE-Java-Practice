import java.util.*;
public class pr129
{
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two strings: ");
      String a = sc.nextLine(), b = sc.nextLine(), c = "";
      System.out.println("__________________________");
      if(a.length()!=b.length())
      {
          System.out.println("The Strings are not of same length.");
      }
      else
      for(int i = a.length()-1;i>=0; i--)
      {
          c = c + a.charAt(i);
      }
      System.out.println((c.equals(b)==true)?"The strings are reverse":"They are not reverse");
    }
}