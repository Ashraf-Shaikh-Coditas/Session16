package Week4.Session16.File_Writing;

import java.io.*;

public class BufferedOutputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {

        File f=new File("src/Week4/Session16/File_Writing/BOSDemo.txt");

        FileOutputStream fout = new FileOutputStream(f);

        BufferedOutputStream bout=new BufferedOutputStream(fout);
        if(f.exists()){
            String s="A , very warm welcome to all of you !! \n" +
                    "Buffered Output Stream Class";
            byte[] b=s.getBytes();
            fout.write(b);
        }
        else
            System.out.println("File does not exist");
    }
}

/*
 File Created :: BOSDemo.txt
* */
