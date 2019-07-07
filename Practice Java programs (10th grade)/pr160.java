import java.util.*;
/*
 * india is my country
 * cy my is ia
 */
public class pr160
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String s = sc.nextLine().trim();
      s = " " + s;
      System.out.println("______________________________________");
      int x = s.length()-1;
      for(int i = s.length()-1; i>=0; i--)
      {
          if(s.charAt(i)==' ')
          {
              System.out.print(s.charAt(i+1)+""+s.charAt(x)+" ");
              x = i-1;
          }
      }
    }
}