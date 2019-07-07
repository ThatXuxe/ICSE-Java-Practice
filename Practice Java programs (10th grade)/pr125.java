import java.util.*;
public class pr125
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = sc.nextLine();
      String t = "";
      for(int i = 0; i<s.length(); i++)
      {
          
          if(s.charAt(i)>=97 && s.charAt(i)<=(97+27))
              t = t + (char)(s.charAt(i)-32);
          else if(s.charAt(i)<=92 && s.charAt(i)>=65)
              t = t + (char)(s.charAt(i)+32);
          else  
          {
              t = t + s.charAt(i);
          }
      }
      System.out.println("Final string : "+t);
    }
}