/*
 * distance traveled         rate
 *  first 10km                5
 *  next 10                   10
 *  next 20                   15
 *  next 40                   20
 *  rest                      25
 */
import java.util.*;
public class pr10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double dist, bill;
        
        System.out.println("Enter the distance");
        dist = sc.nextDouble();
        
        if(dist<80)
        {
            if(dist<40)
            {
                if(dist<20)
                {
                    if(dist<10)
                    {
                        bill = dist*5;
                    }
                    else
                    {
                        bill = 50+(dist-10)*10;
                    }
                }
                else
                {
                    bill = (10*5)+(10*10)+((dist-20)*15);
                }
            }
            else
            {
                bill = (10*5)+(10*10)+(20*15)+((dist-40)*20);
            }
        }
        else
        {
            bill = (10*5)+(10*10)+(20*15)+(40*20)+((dist-80)*25);
        }
        System.out.println("The amount is: "+bill);
    }
}