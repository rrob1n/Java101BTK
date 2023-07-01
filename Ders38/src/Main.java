import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("/home/kurisu/Documents/repos/Java101BTK/Ders38/src/sayilar.txt"));
            String line = null;
            while((line = reader.readLine()) != null){
                total += Integer.valueOf(line);
            }
            System.out.println("Total : " + total);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
    }
}