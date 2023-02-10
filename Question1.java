import java.util.*;
class Question1
{
    public static ArrayList<Integer> que1(int arr[])
    {
        int i=1,j=arr.length,k=0;
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(arr);
        while(k<j)
        {
            if(arr[k]==i)
            k+=1;
            else
            a.add(i);
            i+=1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=inp.nextInt();
        System.out.println(que1(arr));
        inp.close();
    }
}
