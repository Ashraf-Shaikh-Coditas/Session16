package Week4.Session16.FileDemo;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String args[]) throws IOException {

        File f=new File("src/Week4/Session16/FileDemo/file1.txt");
        if(f.exists()){
            System.out.println("File Exists");
            System.out.println("File name is::"+f.getName());
            System.out.println("File parent is::"+f.getParent());
            System.out.println("File Parent is::"+f.getParentFile());
            System.out.println("File path  is::"+f.getPath());
            System.out.println("File Absolute Path is::"+f.getAbsolutePath());
            System.out.println("File property:read=="+f.canRead());
            System.out.println("file property:write=="+f.canWrite());
            System.out.println("File property:execute=="+f.canExecute());
            System.out.println("File exists or not :: "+f.exists());
            System.out.println("Canonical file is :: "+f.getCanonicalFile());
            System.out.println("Canonical file path is :: "+f.getCanonicalPath());
            System.out.println("Free Space :: "+f.getFreeSpace());
            System.out.println("Total Space :: "+f.getTotalSpace());
            System.out.println("Available Space :: "+f.getUsableSpace());
            System.out.println("Is it a file :: "+f.isFile());
            System.out.println("Is it a directory :: "+f.isDirectory());
            System.out.println("Is file hidden :: "+f.isHidden());
//            System.out.println(f.delete());   // deletes the file
//            System.out.println("File exists or not :: "+f.exists());  // returns false if above method is executed



        }
        else
            System.out.println("File Does not exists");
    }
}

/*
File Exists
File name is::file1.txt
File parent is::src\Week4\Session16\FileDemo
File Parent is::src\Week4\Session16\FileDemo
File path  is::src\Week4\Session16\FileDemo\file1.txt
File Absolute Path is::C:\Users\Coditas\IdeaProjects\Training\src\Week4\Session16\FileDemo\file1.txt
File property:read==true
file property:write==true
File property:execute==true
File exists or not :: true
Canonical file is :: C:\Users\Coditas\IdeaProjects\Training\src\Week4\Session16\FileDemo\file1.txt
Canonical file path is :: C:\Users\Coditas\IdeaProjects\Training\src\Week4\Session16\FileDemo\file1.txt
Free Space :: 204359331840
Total Space :: 255406411776
Available Space :: 204359331840
Is it a file :: true
Is it a directory :: false
Is file hidden :: false


* */