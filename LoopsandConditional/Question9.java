import java.util.*;
class Question9
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println("Enter a numer to check prime or not");
        if(n<=1)
        System.out.println(n+ " is Not a Prime number");
        else{
            int f=1;
            for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    f=0;
                    break;
                }
            }
            if(f==1)
            System.out.println(n+" is a Prime number");
            else
            System.out.println(n+ " is Not a Prime number");
        }
    }
}