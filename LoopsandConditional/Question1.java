import java.util.*;
class Question1
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=inp.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }
        inp.close();
    }
}