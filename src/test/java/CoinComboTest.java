import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;


public class CoinComboTest {

  @Test
  public void checkCoinCombo_Quarter_3(){
    CoinCombo testCoinCombo = new CoinCombo();
    Integer expected = 3;
    assertEquals(expected, testCoinCombo.comboOfCoins(76));
  }
}
