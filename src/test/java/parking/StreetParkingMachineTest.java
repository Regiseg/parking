package parking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StreetParkingMachineTest {

    Map<Coin, Integer> coins = new HashMap<>();

    @BeforeEach
    public void init() {
        coins.put(Coin.KETSZAZ, 3);
        coins.put(Coin.HUSZ, 4);
        coins.put(Coin.OT, 5);
    }

    @Test
    void testLoadCoinCassette() {
        StreetParkingMachine spm = new StreetParkingMachine("R1");
        assertEquals(0, spm.getCoinsCassette().get(Coin.HUSZ));
        assertEquals(0, spm.getCoinsCassette().get(Coin.TIZ));
        assertEquals(0, spm.getValueOfSumMoney());

        spm.loadCoinCasette(coins);
        assertEquals(4, spm.getCoinsCassette().get(Coin.HUSZ));
        assertEquals(0, spm.getCoinsCassette().get(Coin.TIZ));
        assertEquals(705, spm.getValueOfSumMoney());

        spm.loadCoinCasette(coins);
        assertEquals(8, spm.getCoinsCassette().get(Coin.HUSZ));
        assertEquals(0, spm.getCoinsCassette().get(Coin.TIZ));
        assertEquals(1410, spm.getValueOfSumMoney());

        System.out.println(spm.getCoinsCassette());
    }

}