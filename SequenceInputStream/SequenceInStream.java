package Week4.Session16.SequenceInputStream;

import java.io.*;

public class SequenceInStream {
    public static void main(String args[]) throws FileNotFoundException, IOException {

        FileInputStream fin1=new FileInputStream("src/Week4/Session16/SequenceInputStream/Abc.txt");
        FileInputStream fin2=new FileInputStream("src/Week4/Session16/SequenceInputStream/Abcd.txt");

        SequenceInputStream sin=new SequenceInputStream(fin1,fin2);

        File f1 = new File("src/Week4/Session16/SequenceInputStream/Combined.txt");
        FileOutputStream fout = new FileOutputStream(f1);

        int i=0;
        while ((i=sin.read())!=-1){
            fout.write(i);
            System.out.print((char)i);
        }

        fin1.close();
        fin2.close();
        sin.close();
        fout.close();

    }
}
/*
  File Created :: Combined.txt
* */

/*
Welcome to Coditas Family .
Thanks for joining!!!!
Hi , This is Ashraf Shaikh .
From Jalgaon
* */