public abstract class GameCalculator {
    // extend eden her class mu metodu overridelamalidir
    public abstract void hesapla();

    public final void gameOver() {
        System.out.println("Oyun Bitti!");
    }
}
