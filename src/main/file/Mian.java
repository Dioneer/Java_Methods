package main.file;

import java.io.*;

public class Mian {
    public static void main(String[] args) {

        File file = new File("out.txt");
        File file2 = new File("out1.txt");
        /**
         * int библиотеки
         */
//        try(FileReader readFile = new FileReader(file); FileWriter fileWriter = new FileWriter(file2)){
//            int redLine = -1;
//            while((redLine = readFile.read())!=-1){
//                fileWriter.write(redLine);
//                System.out.println(redLine);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        /**
         * byte библиотеки
         */
        try(InputStream ips = new FileInputStream(file2);OutputStream ops = new FileOutputStream(file)){
            byte[] bytes = new byte[1024];
            int readStream;
            while ((readStream = ips.read(bytes))!=-1){
                System.out.println(bytes);
                ops.write(bytes);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
