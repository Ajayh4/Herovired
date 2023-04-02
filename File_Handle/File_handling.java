import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.File.io;
import java.io.File;
import java.io.FileWriter;
class File_handling
{
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Please enter the Menu");
            System.out.println("1. Create a new folder");
            System.out.println("2. Create a new text file");
            System.out.println("3. Write into a text file");
            System.out.println("4. Append data to a text file");
            System.out.println("5. Rename a file");
            System.out.println("6. Delete a file");
            Scanner inp=new Scanner(System.in);
            char ch=inp.next().charAt(0);
            if(ch=='1')
            {
                try
                {
                    System.out.println("Please Enter the folder name to be created");
                    String f=inp.next();
                    System.out.println("Please enter the path where you wish to save new folder");
                    String p=inp.next();
                    File f1=new File(p+f);
                    f1.mkdir();
                    System.out.println("Folder created successfully in desired locaton");
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("Press 'Y' to go back to File-Operations Menu");
                char x=inp.next().charAt(0);
                if(x!='Y' && x!='y')
                break;
            }
            else if(ch=='2')
            {
                try
                {
                    System.out.println("Please Enter the file name to be created");
                    String f=inp.next();
                    System.out.println("Please enter the path where you wish to save new file");
                    String p=inp.next();
                    File f1=new File(p+f);
                    f1.createNewFile();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("Press 'Y' to go back to File-Operations Menu");
                char x=inp.next().charAt(0);
                if(x!='Y' && x!='y')
                break;
            }
            else if(ch=='3')
            {
                try
                {
                    System.out.println("Please Enter the file name to write data");
                    String f=inp.next();
                    System.out.println("Please enter the path of the file");
                    String p=inp.next();
                    FileWriter f1=new FileWriter(p+f);
                    System.out.println("Enter data to be written inside file");
                    String data=inp.next();
                    f1.write(data);
                    f1.close();
                }
                catch(Exception e)
                {
                    System.out.println("HEllo");
                    e.printStackTrace();
                }
                System.out.println("Press 'Y' to go back to File-Operations Menu");
                char x=inp.next().charAt(0);
                if(x!='Y' && x!='y')
                break;
            }
            else if(ch=='4')
            {
                try
                {
                    System.out.println("Please Enter the file name to write data");
                    String f=inp.next();
                    System.out.println("Please enter the path of the file");
                    String p=inp.next();
                    FileWriter f1=new FileWriter(p+f);
                    System.out.println("Enter data to be written inside file");
                    String data=inp.next();
                    f1.write(data);
                    f1.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("Press 'Y' to go back to File-Operations Menu");
                char x=inp.next().charAt(0);
                if(x!='Y' && x!='y')
                break;
            }
            else if(ch=='5')
            {
                try
                {
                    System.out.println("Please Enter the file name to be renamed");
                    String f=inp.next();
                    System.out.println("Please enter the path where file has been saved");
                    String p=inp.next();
                    File f1=new File(p+f);
                    System.out.println("Please Enter the new file name");
                    String fr=inp.next();
                    File f2=new File(p+fr);
                    f1.renameTo(f2);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("Press 'Y' to go back to File-Operations Menu");
                char x=inp.next().charAt(0);
                if(x!='Y' && x!='y')
                break;
            }
            else if(ch=='6')
            {
                try
                {
                    System.out.println("Please Enter the file name to be deleted");
                    String f=inp.next();
                    System.out.println("Please enter the path where file has been saved");
                    String p=inp.next();
                    File f1=new File(p+f);
                    f1.delete();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("Press 'Y' to go back to File-Operations Menu");
                char x=inp.next().charAt(0);
                if(x!='Y' && x!='y')
                break;
            }
            else{
                System.out.println("Wrong choice");
            }
        }
    }
}