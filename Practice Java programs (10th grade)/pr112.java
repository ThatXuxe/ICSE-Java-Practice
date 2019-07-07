import java.util.*;
public class pr112
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter 6 characters: ");
      char[] arr = new char[6];
      int  v=0,c=0;
      for(int i = 0; i<6; i++)
      {
          arr[i] = sc.next().charAt(0);
          if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
              v++;
          else if((int)arr[i]>=65)
              c++;
      }
      System.out.println("__________________________");
      char[] con = new char[c+1];
      char[] vow = new char[v+1];
      int j = 0, k = 0;
      for(int i = 0; i<6; i++)
      {
          if((arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'))
          {
              vow[j]=arr[i];
              j++;
          }    
          else if((int)arr[i]>65)
          {
              con[k]=arr[i];
              k++;
          }    
      }
      System.out.println("consonants: ");
      for(int i = 0; i<con.length; i++)
      {
          System.out.print(con[i]+"\t");
      }
      System.out.println("vowels: ");
      for(int i = 0; i<vow.length; i++)
      {
          System.out.print(vow[i]+"\t");
      }
    }
}