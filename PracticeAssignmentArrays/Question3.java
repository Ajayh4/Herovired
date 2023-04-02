import java.util.*;
class Question3
{
    public static void rev(int a[])
    {
        int s=0,e=a.length-1;
        while(s<e)
        {
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s+=1;
            e-=1;
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=inp.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=inp.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("After Sorting in Ascending Order");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        rev(a);
        System.out.println("After Sorting in Descending Order");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}