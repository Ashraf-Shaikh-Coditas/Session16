package Week4.Session16.File_Reading;

import java.io.*;

public class PipedInputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        PipedOutputStream pout = new PipedOutputStream();
        PipedInputStream pin = new PipedInputStream();

        pout.connect(pin);

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 65 ;i <= 90;i++) {
                    try{
                        pout.write(i);
                        Thread.sleep(100);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 65 ;i <= 90;i++) {
                    try{
                        System.out.println(pin.read());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

/*

65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90

* */