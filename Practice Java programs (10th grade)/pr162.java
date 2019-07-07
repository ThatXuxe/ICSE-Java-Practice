import java.util.*;
public class pr162
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 numbers: ");
      int[] arr = new int[5]; 
      for(int i = 0 ; i<5; i++)
          arr[i] = sc.nextInt();
      System.out.println("______________________________________");
      int x = 0;
      for(int i = 1; i<5; i++)
          if(arr[x]>arr[i])
              x = i;
      System.out.print("Smallest Number: "+arr[x]);
    }
}