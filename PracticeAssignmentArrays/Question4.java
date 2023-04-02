import java.util.*;
class Question4
{
    public static boolean prime(int n)
    {
        if(n<=1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n=inp.nextInt();   
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=inp.nextInt();
        Arrays.sort(a);
        int f=1;
        for(int i=n-1;i>=0;i--)
        {
            if(prime(a[i]))
            {
                System.out.println(a[i]+" is largest prime");
                f=0;
                break;
            }
        }
        if(f==1)
        System.out.println("No primes present in array");
    }
}