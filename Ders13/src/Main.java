public class Main {
    public static void main(String[] args) {

        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli unlu");
                break;
            default:
                System.out.println("Ince sesli unlu");
        }
    }
}