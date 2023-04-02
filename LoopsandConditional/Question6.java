import java.util.*;
class Question6
{
    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=inp.nextInt();
        int c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            System.out.printf("* ");
            System.out.println();
            if(i!=n-1)
            c+=2;
        }
        c-=2;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<c;j++)
            System.out.printf("* ");
            System.out.println();
            c-=2;
        }
    }
}