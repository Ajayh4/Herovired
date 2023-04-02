import java.util.*;
class Question7
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=inp.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            System.out.printf("* ");
            System.out.println();
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<i;j++)
            System.out.printf("* ");
            System.out.println();
        }
    }
}