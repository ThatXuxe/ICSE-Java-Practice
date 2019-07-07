public class pr181
{
    public static void main(String args[])
    {
        int a = 1;
        char c = 'c';//c3c5
        while(a<5)//2
        {
            if(a++%2!=0)
            {
                a(c);
            }
            else
            {
                c(a);
            }
        }
    }
    public static void a(char c)
    {
        System.out.print(c);
    }
    public static void c(int a)
    {
        System.out.print(a);
    }
}