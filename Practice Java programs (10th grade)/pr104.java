import java.util.*;
public class pr104
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length: ");
      int n = sc.nextInt();
      char[] ch = new char[n];
      int[] code = new int[n];
      System.out.println("Enter characters:");
      for(int i = 0; i<n; i++)
      {
          System.out.println("Enter character: ");
          ch[i] = sc.next().charAt(0);
          System.out.println("Enter its code: ");
          code[i] = sc.nextInt();
      }
      System.out.println("__________________________");
      System.out.println("Enter 1 for character search, 2 for code search: ");
      int flag = 0, i;
      switch(sc.nextInt())
      {
          case 1: System.out.println("Enter Search character: ");
                  char s = sc.next().charAt(0);
                  for(i = 0; i<n; i++)
                  {
                      if(s == ch[i])
                      {
                          flag = 1;
                          break;
                      }
                  }
                  System.out.println((flag == 1)?"item found at "+(i+1)+"\ncode: "+code[i]:"not found");
                  break;
                  
          case 2: System.out.println("Enter Search code: ");
                  int t = sc.nextInt();
                  for(i = 0; i<n; i++)
                  {
                      if(t == code[i])
                      {
                          flag = 1;
                          break;
                      }
                  }
                  System.out.println((flag == 1)?"item found at "+(i+1)+"\ncharacter: "+ch[i]:"not found");
                  break;
            
          default: System.out.println("Wrong input. Try again");        
      }
    }
}