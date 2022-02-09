package Week4.Session16.File_Writing;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {

        File f=new File("src/Week4/Session16/File_Writing/FOSDemo.txt");

        FileOutputStream fout=new FileOutputStream(f);
        if(f.exists()){
            fout.write(65);

            String s=" , very warm welcome to all of you !! ";
            byte[] b=s.getBytes();
            fout.write(b);
        }
        else
            System.out.println("File does not exist");
    }
}

/*
 File Created :: FOSDemo.txt
* */
