package file;

import java.io.*;

public class BufferedReagerPractice {
    public static void main(String[] args) throws IOException {
       FileReader fi = new FileReader("output.html");
        BufferedReader bf = new BufferedReader(fi);
        String content;
        System.out.println(bf.readLine());
        while ((content = bf.readLine()) != null){
            System.out.println(content);
        }
        FileWriter test = new FileWriter("test.txt");
        BufferedWriter pw  = new BufferedWriter(test);
        pw.write("Manish pudasaini");
        pw.close();
    }
}
