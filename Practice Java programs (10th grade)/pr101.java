import java.util.*;
public class pr101
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length: ");
      char[] ch = new char[sc.nextInt()];
      System.out.println("Enter a word: ");
      for(int i = 0; i<ch.length; i++)
          ch[i] = sc.next().charAt(0);
      System.out.println("__________________________");
      char[] arr = new char[ch.length];
      int k = arr.length-1;
      for(int i = 0; i<ch.length;i++)
      {
          arr[i] = ch[k];
          if(arr[i]>=97 && arr[i]<=122)
              arr[i] = (char)((int)arr[i]-32);
          else if(arr[i]>=65 && arr[i]<=90)    
              arr[i] = (char)((int)arr[i]+32);
          k--;
      }
      for(int i = 0; i<arr.length; i++)
      {
          System.out.println(arr[i]);
      } 
    }
}