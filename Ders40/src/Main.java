import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        getFileInfo();
    }

    public static void createFile() throws IOException {
        File file = new File("/home/kurisu/Documents/repos/Java101BTK/files/students.txt");
        if (file.createNewFile()) {
            System.out.println("Dosya olusturuldu!");
        } else {
            System.out.println("Bu dosya zaten var!");
        }
    }

    public static void getFileInfo() {
        File file = new File("/home/kurisu/Documents/repos/Java101BTK/files/students.txt");
        if (file.exists()) {
            System.out.println("Dosya adi : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosyanin boyutu (byte): " + file.length());
        }
    }

}