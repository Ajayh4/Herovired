import java.util.*;
class Question5
{
    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        char c;
        while(true)
        {
            System.out.println("\nMenu based app - Unit conversion for Distance\n1.CM to M\n2.M to KM\n3.KM to M\n4.M to CM");
            System.out.print("Enter your menu ");
            int i=inp.nextInt();
            System.out.print("Please enter the CM Value: ");
            double val=inp.nextDouble();
            if(i==1){
                System.out.printf("%d CM = %.2f M\n",(int)val,(val/100));
            }
            else if(i==2)
            {
                System.out.printf("%.2f M = %.2f KM\n",val,(val/1000));
            }
            else if(i==3){
                System.out.printf("%.2f KM = .%2f M\n",val,(val*1000));
            }
            else if(i==4)
            {
                System.out.printf("%.2f M = %.2f CM\n",val,(val*100));
            }
            else{
                System.out.println("Invalid Choice");
            }
            System.out.print("Do you want to Continue:");
            c=inp.next().charAt(0);
            if(c!='y' && c!='Y')
            break;
        }
        inp.close();
    }
}