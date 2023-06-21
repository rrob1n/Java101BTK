public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger logger) {
        this.baseLogger = logger;
    }

    public void Add() {
        System.out.println("Musteri eklendi.");
        this.baseLogger.Log("log mesaji");
    }
}
