public class EmailLogger extends BaseLogger {
    @Override
    public void Log(String message) {
        System.out.println("Logged to Email! : " + message);
    }
}
