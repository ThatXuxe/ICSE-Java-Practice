//>5000 discount
import java.util.*;
public class ifpr
{
    public static void main(String args[])
    {
        double disc, amt, pr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of article:");
        pr = sc.nextDouble();
        if(pr>5000)
        {
            disc = pr*0.1;
            amt = pr-disc;
            System.out.println("Amount is:"+(pr-(pr*0.1))+"\n discount is: "+pr*0.1+" rupees");
        }
        else
        {
            System.out.println("Sorry, no discount, amount = "+pr);
        }
    }
}
