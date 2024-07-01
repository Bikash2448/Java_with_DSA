import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class knuopp2 {
    public static void main(String[] args) {
        String BBB = "aaa.txt";
        try {
            FileWriter fw = new FileWriter(BBB);
            fw.write
            fw.write("Hello Biku, I Am Here");
            fw.close();
        } catch (Exception e) {
            System.out.println("BSDK "+e.getMessage());
        }
    }
}

