package parking;

public enum Banknote implements Cash {

    HUSZEZER(20_000),
    TIZEZER(10_000),
    OTEZER(5_000),
    KETEZER(2_000),
    EZER(1_000),
    OTSZAZ(500);

    private int value;

    Banknote(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
