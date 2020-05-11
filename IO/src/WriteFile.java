import java.io.*;

public class WriteFile {
    public static void main(String[] args)throws IOException {
        String hoTen = "Pham Ngoc Tuan";
        int tuoi = 20;
        File file = new File("danhsach.txt");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bf = new BufferedOutputStream(fileOutputStream);
            bf.write(hoTen.getBytes());
            bf.write("\n".getBytes());
            bf.write(tuoi);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
