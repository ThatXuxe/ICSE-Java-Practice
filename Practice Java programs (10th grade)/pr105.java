import java.util.*;
public class pr105
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length: ");
      int n = sc.nextInt();
      char[] arr = new char[n];
      int[] code = new int[n];
      System.out.println("Enter characters:");
      for(int i = 0; i<n; i++)
      {
          System.out.println("Enter character: ");
          arr[i] = sc.next().charAt(0);
          System.out.println("Enter its code: ");
          code[i] = sc.nextInt();
      }
      System.out.println("__________________________");
      System.out.println("Enter 1 for character search, 2 for code search: ");
      int flag = 0;
      int first = 0, last = n-1, mid = 0;
      switch(sc.nextInt())
      {
          case 1: System.out.println("Enter Search character: ");
                  char s = sc.next().charAt(0);
                  while(first<last)
                  {
                     mid = (first + last)/2;
                     if(s==arr[mid])
                     {
                        flag = 1;
                        break;
                     }
                     else if(s>arr[mid])
                     {
                         first = mid++;
                     }
                     else
                     {
                         last = mid--;
                     }
                  }
                  System.out.println((flag == 1)?"item found at "+(mid+1)+"\ncode: "+code[mid]:"not found");
                  break;
                  
          case 2: System.out.println("Enter Search code: ");
                  int t = sc.nextInt();
                  while(first<last)
                  {
                      mid = (first + last)/2;
                      if(code[mid] == t)
                      {
                          flag = 1; 
                          break;
                      }
                      else if(t>code[mid])
                      {
                          first = mid+1;
                      }
                      else 
                      {
                          last = mid-1;
                      }
                  }
                  System.out.println((flag == 1)?"Item found at "+(mid+1)+"\ncharacter: "+arr[mid]:"not found");
                  break;
            
          default: System.out.println("Wrong input. Try again");        
      }
    }
}