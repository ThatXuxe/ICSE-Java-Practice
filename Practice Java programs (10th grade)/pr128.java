import java.util.*;
public class pr128
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two strings: ");
      String a = sc.nextLine(), b = sc.nextLine(); 
      System.out.println("__________________________");
      int flag = 0;
      if(a.length()!=b.length())
      {
          System.out.println("Not equal.");
      }
      else
          for(int i = 0; i<a.length(); i++)
          {
              if(a.charAt(i)!=b.charAt(i))
              {
                  flag = 1; 
                  break;
              }    
          }
      if(flag == 0)
      System.out.println("The strings are equal.")  ;  
      else
      System.out.println("Strings are unequal");
    }
}