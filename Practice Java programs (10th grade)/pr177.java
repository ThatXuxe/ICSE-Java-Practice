import java.util.*;
/*
 */
public class pr177
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter String: ");
      String s = sc.nextLine();
      System.out.println("Enter start and end indexes: ");
      int a = sc.nextInt(), b = sc.nextInt();
      if(a>b)
      {
          int temp = a;
          a = b; 
          b = temp;
      }
      System.out.println("______________________________________");
      char x = ' ';
      while(x != 'e')
      {
          System.out.println(" Enter 1 for function 1\n Enter 2 for function 2\n Enter e for exit");
          x = sc.next().charAt(0);
          switch(x)
          {
              case '1':System.out.println(f1(s,a,b));
                       break;
              case '2':System.out.println(f2(s,a,b));
                       break;
              case 'e':System.exit(0);
              default:System.out.println("wrong input, try again");
          }
      }
    }
    private static String f1(String s, int a, int b)
    {
      String t = ""; 
      for(int i = a; i<=b; i++)
      {
          t += s.charAt(i); 
      }
      return t;
    }
    private static String f2(String s, int a, int b)
    {
        String t = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(i<=a || b<=i)
                t += s.charAt(i);
        }
        return t;
    }
}