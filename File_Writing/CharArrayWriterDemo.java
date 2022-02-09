package Week4.Session16.File_Writing;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String args[]) throws IOException {
        CharArrayWriter out=new java.io.CharArrayWriter();
        out.write("Char Array Demo text ");

        FileWriter f1=new FileWriter("src/Week4/Session16/File_Writing/a1.txt");
        FileWriter f2=new FileWriter("src/Week4/Session16/File_Writing/a2.txt");
        FileWriter f3=new FileWriter("src/Week4/Session16/File_Writing/a3.txt");

        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);

        f1.close();
        f2.close();
        f3.close();
    }
}

/*
*  Files Created :: a1.txt,a2.txt,a3.txt
* */
