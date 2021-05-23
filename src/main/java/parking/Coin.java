package parking;

public enum Coin implements Cash {

    KETSZAZ(200),
    SZAZ(100),
    OTVEN(50),
    HUSZ(20),
    TIZ(10),
    OT(5);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
