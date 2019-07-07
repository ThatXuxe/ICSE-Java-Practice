import java.util.*;
public class pr131
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = sc.nextLine();
      System.out.println("Enter a character: ");
      char ch = sc.next().charAt(0);
      System.out.println("__________________________");
      int c = 0;
      for(int i = 0; i<s.length(); i++)
      {
          if(s.charAt(i)==ch)
             c++;
      }
      System.out.println((c>0)?"character is present\ncount: "+c:"not present.");
    }
}