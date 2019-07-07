import java.util.*;
public class pr110
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int[] arr = {3,2,1,5,2} ;
      int j = 0;
      for(int i=0;i<arr.length;)
      {
          arr[i++]=arr[0]++;
      }
      for(int i = 0; i<arr.length; i++)
      System.out.println(arr[i]);//73456
    }
}