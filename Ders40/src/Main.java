import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getFileInfo();
        writeFile();
        readFile();
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

    public static void readFile() {
        File file = new File("/home/kurisu/Documents/repos/Java101BTK/files/students.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/kurisu/Documents/repos/Java101BTK/files/students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazildi!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}