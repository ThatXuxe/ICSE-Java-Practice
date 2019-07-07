import java.util.*;
/*
 * soham
 * oashm
 */
public class pr167
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = sc.nextLine().trim();
      System.out.println("______________________________________");
      String t = ""; 
      for(int x = 1; x<=2; x++)
      for(int i = 0; i<s.length(); i++)
      {
          if(x == 1)
          if((s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') && (x==1))
          {
              t = t + s.charAt(i);
          }
          if(x==2)
          if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')
          {
              t = t + s.charAt(i);
          }
      }
      System.out.println("result: "+t);
    }
}