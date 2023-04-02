import java.io.FileReader;
import java.util.*;
class Count_characters
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter file name with path");
        String f=inp.nextLine();
        try{
            FileReader fr=new FileReader(f);
            int i,c=0;
            while((i = fr.read())!=-1)
            {
            c+=1;
            }
            System.out.println(c);
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }
}