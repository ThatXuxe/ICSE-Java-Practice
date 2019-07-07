import java.util.*;
public class pr11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter two numbers");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>y)
        {
          x=x+y;
          y=x-y;
          x=y-x;
         
        }  
        while(x<=y)
        {
            System.out.println(x);
            x++;
        }
    }
}
