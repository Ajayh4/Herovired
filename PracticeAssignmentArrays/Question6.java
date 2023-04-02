import java.util.*;
class Question6
{
    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of elements for array1");
        int n=inp.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=inp.nextInt();
            if(hm.containsKey(a[i]))
            hm.put(a[i],hm.get(a[i])+1);
            else
            hm.put(a[i],1);
        }
        System.out.println("Enter number of elements from array2");
        int m=inp.nextInt();
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            b[i]=inp.nextInt();
            if(hm.containsKey(b[i]))
            System.out.println("Frequency of "+b[i]+" is "+hm.get(b[i]));
        }
    }
}