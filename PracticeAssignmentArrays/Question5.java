import java.util.*;
class Question5
{
    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=inp.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=inp.nextInt();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=1)
            a[j++]=a[i];
        }
        for(int i=j;i<n;i++)
        a[i]=1;
        System.out.println("After moving ones");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}