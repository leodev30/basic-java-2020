import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;

public class ReadFile {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("danhsach.txt"));
            while(bis.available() >0){
                char c = (char) bis.read();
                System.out.print(c);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{
                bis.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
