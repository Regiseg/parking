package parking;

import java.util.LinkedHashMap;
import java.util.Map;

public class GarageParkingMachine extends ParkingMachine {

    private Map<Banknote, Integer> banknotesCasette = new LinkedHashMap<>();

    public GarageParkingMachine(String name, Map<Banknote, Integer> banknotesCasette) {
        super(name);
        banknotesCasette.put(Banknote.HUSZEZER, 0);
        banknotesCasette.put(Banknote.TIZEZER, 0);
        banknotesCasette.put(Banknote.OTEZER, 0);
        banknotesCasette.put(Banknote.KETEZER, 0);
        banknotesCasette.put(Banknote.EZER, 0);
        banknotesCasette.put(Banknote.OTSZAZ, 0);
    }

    public Map<Banknote, Integer> getBanknotesCasette() {
        return banknotesCasette;
    }

    public void loadBanknotesCasette(Map<Banknote, Integer> banknotes) {
        if (banknotes == null) {
            throw new IllegalArgumentException("Coins must not be null");
        }
        for (Banknote banknote : banknotes.keySet()) {
            banknotesCasette.put(banknote, banknotesCasette.get(banknote) + banknotes.get(banknote));
            increaseValueOfSumMoney(banknote.getValue() * banknotes.get(banknote));
        }
    }
}
