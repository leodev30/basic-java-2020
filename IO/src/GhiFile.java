//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class GhiFile{
//    public static void main(String[] args) {
//        String hoTen = "Pham Ngoc Tuan";
//        int tuoi = 20;
//        try {
//            File f = new File("E:/Iostream.txt");
//            FileWriter fw = new FileWriter(f);
//            fw.write(hoTen);
//            fw.write(tuoi);
//            fw.close();
//        } catch (IOException ex) {
//            System.out.println("Loi ghi file: " + ex);
//        }
//    }
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GhiFile {
    public static void main(String[] args) {
        String hoTen = "ABC";
        int tuoi = 30;
        BufferedWriter bufferedWriter = null;
        try{
            bufferedWriter = new BufferedWriter(new FileWriter(new File("data.txt")));
            bufferedWriter.write(hoTen);
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(tuoi));
            bufferedWriter.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try {
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        File file = new File("data.dat");
//        BufferedWriter bufferedWriter = null;
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(hoTen);
//            bufferedWriter.newLine();
//            bufferedWriter.write(String.valueOf(tuoi));
//            bufferedWriter.flush();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }finally{
//            try {
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
