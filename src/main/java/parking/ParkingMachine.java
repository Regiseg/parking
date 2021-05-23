package parking;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class ParkingMachine {


    private String name;

    private Map<Coin, Integer> coinsCassette = new LinkedHashMap<>();

    private int valueOfSumMoney = 0;

    public ParkingMachine(String name) {
        this.name = name;
        coinsCassette.put(Coin.KETSZAZ, 0);
        coinsCassette.put(Coin.SZAZ, 0);
        coinsCassette.put(Coin.OTVEN, 0);
        coinsCassette.put(Coin.HUSZ, 0);
        coinsCassette.put(Coin.TIZ, 0);
        coinsCassette.put(Coin.OT, 0);
    }

    public String getName() {
        return name;
    }

    public Map<Coin, Integer> getCoinsCassette() {
        return coinsCassette;
    }

    public int getValueOfSumMoney() {
        return valueOfSumMoney;
    }

    public void increaseValueOfSumMoney(int amount) {
        valueOfSumMoney += amount;
    }

    public void loadCoinCasette(Map<Coin, Integer> coins) {
        if (coins == null) {
            throw new IllegalArgumentException("Coins must not be null");
        }
        for (Coin coin : coins.keySet()) {
            coinsCassette.put(coin, coinsCassette.get(coin) + coins.get(coin));
            increaseValueOfSumMoney(coin.getValue() * coins.get(coin));
        }
    }
}
