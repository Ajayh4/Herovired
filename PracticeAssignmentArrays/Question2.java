import java.util.*;
class Question2
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=inp.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=inp.nextInt();
        int s=0,e=n-1;
        while(s<e)
        {
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s+=1;
            e-=1;
        }
        System.out.println("After reversing");
        for(int i=0;i<n;i++)
        System.out.printf(a[i]+" ");
    }
}