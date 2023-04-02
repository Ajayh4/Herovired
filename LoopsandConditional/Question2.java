import java.util.*;
class Question2
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter marks obtained");
        float securedmarks=inp.nextFloat();
        System.out.println("enter total marks");
        int totalmarks=inp.nextInt();
        float percentage=(securedmarks/totalmarks)*100;
        char gr;
        float gpa;
        if(90<=percentage&&100>=percentage){
            gr='A';
            gpa=4;
        }
        else if(80<=percentage&&89>=percentage)
        {
            gr='B';
            gpa=3;
        }
        else if(70<=percentage&&79>=percentage)
        {
            gr='C';
            gpa=2;
        }
        else if(60<=percentage&&69>=percentage)
        {
            gr='D';
            gpa=1;
        }
        else
        {
            gr='F';
            gpa=0;
        }
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+gr+", GPA: "+gpa);
        inp.close();
    }
}