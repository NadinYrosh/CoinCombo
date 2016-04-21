import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;


public class CoinComboTest {

  @Test
  public void checkCoinCombo_Quarter_3(){
    CoinCombo testCoinCombo = new CoinCombo();
    Integer expected = 3;
    assertEquals(expected, testCoinCombo.comboOfCoins(76).get("quarters"));
  }
  @Test
  public void checkCoinCombo_Dime_1(){
    CoinCombo testCoinCombo = new CoinCombo();
    Integer expected = 2;
    assertEquals(expected, testCoinCombo.comboOfCoins(21).get("dimes"));
  }
  @Test
  public void checkCoinCombo_nickel_1(){
    CoinCombo testCoinCombo = new CoinCombo();
    Integer expected = 1;
    assertEquals(expected, testCoinCombo.comboOfCoins(15).get("nikels"));
  }
}
