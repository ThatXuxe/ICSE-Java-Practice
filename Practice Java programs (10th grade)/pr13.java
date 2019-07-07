import java.util.*;

public class pr13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        int s=n;
        while(s!=0)
        {
            System.out.println(s%10+" = "+(s%10)*(s%10)*(s%10));
            s = s/10;
        }
    }
}