import java.util.*;
/*
 */
public class pr169
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a name: ");
      String s = sc.nextLine().trim();
      //System.out.println(s.substring(0,s.indexOf(' '))+s.substring(s.lastIndexOf(' '), s.length()));
      int x = 0, y = 0;
      for(int i = 0 ; i<s.length(); i++)
      {
          if(s.charAt(i)==' ' && x==0)
              x = i;
          else if(s.charAt(i)==' ' && x!=0)
              y = i;
      }
      System.out.print(s.charAt(0)+"\t"+s.charAt(y+1));
        //       for(int i = 0; i<x; i++)
        //           System.out.print(s.charAt(i));
        //       for(int i = y; i<s.length(); i++)
        //           System.out.print(s.charAt(i));
      //System.out.println(s.substring(0,x)+s.substring(y,s.length()));
    }
}