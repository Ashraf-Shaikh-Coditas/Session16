package Week4.Session16.File_Writing;

import Week4.Session16.File_Reading.DataInputStreamDemo;

import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {

        File f=new File("src/Week4/Session16/File_Writing/DOSDemo.txt");

        FileOutputStream fout = new FileOutputStream(f);

        DataOutputStream dout=new DataOutputStream(fout);
        if(f.exists()){

            String s=" A , very warm welcome to all of you !! \n" +
                    "Data Output Stream Class";
            byte[] b=s.getBytes();
            fout.write(b);
        }
        else
            System.out.println("File does not exist");
    }
}

/*
 File Created :: DOSDemo.txt
* */