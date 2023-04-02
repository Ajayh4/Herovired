import java.util.*;
class Question3
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number1:");
        int n1=inp.nextInt();
        System.out.println("Enter number2:");
        int n2=inp.nextInt();
        System.out.println("Before Swapping");
        System.out.println("Num1: "+n1+" Num2:"+n2);
        int t=n1;
        n1=n2;
        n2=t;
        System.out.println("After Swapping");
        System.out.println("Num1: "+n1+" Num2:"+n2);
    }
}