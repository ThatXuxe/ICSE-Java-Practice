import java.util.*;
/*
 * soham kulkarni
 * soham inrakluk
 */
public class pr183ArrayPass
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int x = 0;
      while(x !=3)
      {
          System.out.println("Enter 1 for string to array\nEnter 2 for array string");
          x = sc.nextInt();
          switch(x)
          {
              case 1:System.out.println("Enter a String");
                     String s = sc.next();
                     f1(s);
                     break;
              case 2:System.out.println("Enter first character array length: ");
                     char[] arr = new char[sc.nextInt()];
                     System.out.println("Enter first character array: ");
                     for(int i = 0; i<arr.length; i++)
                     {
                         arr[i] = sc.next().charAt(0);
                     }
                     System.out.println("Enter second character array length: ");
                     char[] ar2 = new char[sc.nextInt()];
                     System.out.println("Enter first character array: ");
                     for(int i = 0; i<ar2.length; i++)
                     {
                         ar2[i] = sc.next().charAt(0);
                     }
                     f2(arr, ar2);
                     break;
              case 3:System.exit(0);
              default:System.out.println("Wrong Input");
          }
      }
      System.out.println("______________________________________");
    }
    public static void f1(String s)
    {
        char arr[] = new char[s.length()];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = s.charAt(i);
        }
        for(int i = 0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void f2(char arr[], char ar2[])
    {
        String s = "";
        String t = "";
        for(int i =0; i<arr.length; i++)
        {
            s+=arr[i];
        }    
        for(int i = ar2.length-1; i>=0; i--)
        {
            t += arr[i];
        }
        System.out.println(s+" "+t);
    }
}