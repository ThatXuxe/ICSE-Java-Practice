import java.util.*;
/*
 */
public class pr168
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a name: ");
      String s = " " + sc.nextLine().trim();
      System.out.println("______________________________________");
      System.out.print(s.substring(s.lastIndexOf(' ')+1,s.length()));
      for(int i = 0; i<s.lastIndexOf(' '); i++)
      {
          if(s.charAt(i)==' ')
              System.out.print("."+s.charAt(i+1));    
      }
    }
}