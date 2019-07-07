import java.util.*;
public class pr132
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = sc.nextLine(), t = "";
      System.out.println("Enter a character: ");
      char a = sc.next().charAt(0);
      System.out.println("__________________________");
      for(int i = 0; i<s.length(); i++)
      {
          if(s.charAt(i)==a)
             t = t + '#';
          else
             t = t + s.charAt(i);   
      }
      System.out.println("New String: "+t);
    }
}