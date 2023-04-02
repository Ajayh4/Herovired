import java.util.*;
class Question4
{
    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        char c;
        while(true){
            System.out.println("Menu based app-Even/Odd Checker");
            System.out.print("Please enter the number: ");
            int a=inp.nextInt();
            if(a%2==0)
            System.out.println("The given number "+a+" is EVEN Number");
            else
            System.out.println("The given number "+a+" is ODD number");
            System.out.print("enter y to continue: ");
            c=inp.next().charAt(0);
            if(c!='Y' && c!='y')
            break;
        }      
    }
}