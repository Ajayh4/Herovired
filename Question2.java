import java.util.*;
class Question2
{
    public static ArrayList<Integer> que2(int arr[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            a.add(arr[i]);
        }
        a.add(arr[arr.length-1]);
        return a;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=inp.nextInt();
        System.out.println(que2(arr));
        inp.close();
    }
}
