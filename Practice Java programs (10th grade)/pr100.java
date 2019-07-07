import java.util.*;
public class pr100
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length:");
      char[] ch = new char[sc.nextInt()];
      for(int i = 0; i<ch.length; i++)
      {
          ch[i] = sc.next().charAt(0);
      }
      System.out.println("__________________________");
      int uc = 0, lc = 0;
      for(int i = 0; i<ch.length; i++)
      {
          if(ch[i]>=97 && ch[i]<=122)
             lc++;
          else if(ch[i]>=65 && ch[i]<=90)
             uc++;
          else
             continue;
      }
      System.out.print("uppercase: "+uc+"\nlowercase: "+lc);
    }
}