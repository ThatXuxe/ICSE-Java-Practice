import java.util.*;
public class pr130
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word");
      String s = sc.nextLine();
      int n = s.length();
      s = s.toLowerCase();
      int c = 0;
      System.out.println("__________________________");
      for(char i = 'a'; i<='z'; i++)
      {
          c = 0;
          for(int k = 0; k<n; k++)
              if(s.charAt(k)==i)
              {
                  c++;
              }
          System.out.println("no. of "+i+" = "+c);
      }
    }
}