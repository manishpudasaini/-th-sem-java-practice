package file;

import java.io.File;
import java.io.IOException;

public class FileReaderPractice {
    public static void main(String[] args) throws IOException {
        File file = new File("output.html");
        java.io.FileReader fileReader = new java.io.FileReader(file);
        int data;
        while ((data = fileReader.read()) != -1) {   //read file data character by character
            System.out.print((char) data);
        }

    }
}
