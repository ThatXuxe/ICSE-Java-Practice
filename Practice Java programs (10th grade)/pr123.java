import java.util.*;
public class pr123
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = sc.nextLine();
      System.out.println("__________________________");
      s.trim();
      for(int i = 1; i<s.length()-1; i++)
           System.out.print(s.charAt(i));
    }
}