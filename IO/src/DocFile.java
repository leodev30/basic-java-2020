
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DocFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("data.txt")));
            String line = "";
            while(br.readLine()!=null){
                System.out.println(line);
            }
            String hoTen = br.readLine();
            String tuoi = br.readLine();
            System.out.println(hoTen + "-" + tuoi);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
