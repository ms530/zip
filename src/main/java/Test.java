import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
public class Test {
    public static void main(String[] args) {
        try{
            new ZipFile("zip1.zip").addFile("C:\\Users\\Lenovo\\Desktop\\anni\\IMG_1332.JPG");
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}
