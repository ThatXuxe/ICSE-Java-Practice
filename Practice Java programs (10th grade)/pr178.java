import java.util.*;
/*
 */
public class pr178
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 characters: ");
      char[] arr = new char[5];
      for(int i = 0; i<5; i++)
      {
          arr[i] = sc.next().charAt(0);
      }
      System.out.println("________________________________________");
      char abc[] = new char[5];
      abc = Sort(arr);
      for(int i = 0; i<arr.length; i++)
        {
            System.out.println(abc[i]);
        }
    }
    private static char[] Sort(char arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j =0 ;j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}