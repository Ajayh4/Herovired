import java.util.*;
class Question10
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Sample input : stringName:");
        String string=inp.next();
        System.out.print("Starting index :");
        int st=inp.nextInt();
        System.out.print("Ending index:");
        int en=inp.nextInt();
        System.out.println("Output: subString of "+string+" from "+st+" to "+en+" is: "+string.substring(st, en+1));
        inp.close();
    }
}