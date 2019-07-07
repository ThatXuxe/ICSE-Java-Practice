import java.util.*;
public class pr108
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter string");
      String s = sc.nextLine();
      System.out.println("Triangle:");
      /*
      do
      {
          if(x == s.indexOf('a'))
          {
              temp = temp+s.charAt(x-1);
          }
          temp = temp+s.charAt(x);
          //Sohham
      }while(++x<s.length());
      System.out.println(temp);
      */
     
      /*
       *          s
       *         soh
       *        soham 
       */
      int x = (s.length()/2);
      for(int i=1; i<=s.length(); i = i+2)
      {
          for(int j = x; j>=0; j--)
          {
              System.out.print(" ");
          }
          for(int k = 0; k<i; k++)
          {
              System.out.print(s.charAt(k));
          }
          x--;
          System.out.println();
      }
    }
} 