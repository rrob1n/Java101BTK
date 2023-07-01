import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/kurisu/Documents/repos/Java101BTK/files/students.txt");
        if (file.createNewFile()) {
            System.out.println("Dosya olusturuldu!");
        }else {
            System.out.println("Bu dosya zaten var!");
        }
    }
    
}