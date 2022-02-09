package Week4.Session16.File_Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f=new File("src/Week4/Session16/File_Reading/Abc.txt");

        FileInputStream fin=new FileInputStream(f);

        if(f.exists()){
            System.out.println("Reading operation");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
        }
        else
            System.out.println("Oops,File not found");
    }

}

/*

Reading operation
Hello World .
This is the Java Training .
File Handling .

* */
