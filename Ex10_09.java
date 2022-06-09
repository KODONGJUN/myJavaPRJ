import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Ex10_09 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Temp/data1.txt");

        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int ch;

        while ((ch = fis.read()) != -1) {
            //while ((ch = isr.read() != -1){
            System.out.print((char) ch);
        }
        fis.close();
    }
}
