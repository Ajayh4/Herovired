import java.util.*;
class Question8
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is largest");
            if(b>c)
            System.out.println(c+" is smallest");
            else
            System.out.println(b+" is smallest");
        }
        else if(b>c && b>a)
        {
            System.out.println(b+" is largest");
            if(a>c)
            System.out.println(c+" is smallest");
            else
            System.out.println(a+" is smallest");
        }
        else
        {
            System.out.println(c+" is largest");
            if(a>b)
            System.out.println(b+" is smallest");
            else
            System.out.println(a+" is smallest");
        }
        System.out.println("Average of three numbers is: "+(a+b+c)/3);
    }
}