package main.file;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mian {
    public static void main(String[] args) throws EOFException, ClassNotFoundException, IOException {

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
//        try(InputStream ips = new FileInputStream(file2);OutputStream ops = new FileOutputStream(file)){
//            byte[] bytes = new byte[1024];
//            int readStream;
//            while ((readStream = ips.read(bytes))!=-1){
//                System.out.println(bytes);
//                ops.write(bytes);
//            }
//        }catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        /**
         * part2
         */
//        try(OutputStream ops = new FileOutputStream(file, true)){
//            String s = " Miamore ";
//            ops.write(s.getBytes());
//        }
        /**
         * part3
         */
//        try(BufferedOutputStream bfw = new BufferedOutputStream(new FileOutputStream(file, true));
//        BufferedInputStream bfr = new BufferedInputStream(new FileInputStream(file))){
//            String s = " Miamore ";
//            bfw.write(s.getBytes());
//            byte[] bytes = new byte[1];
//            int redLine = -1;
//            while ((redLine = bfr.read(bytes))!=-1){
//                System.out.println(Arrays.toString(bytes));
//                bfw.write(bytes);
//            }
//        }
        /**
         * part4
         */
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
            String s = "ASD";
            int[] a = {1, 2, 3};
            out.writeObject(s);
            out.writeObject(a);

            String cc = (String) in.readObject();
            int[] aa = (int[]) in.readObject();

            System.out.println(cc);
            for (int i = 0; i < aa.length; i++) {
                System.out.println(aa[i]+" ");
            }
        }
    }
}
