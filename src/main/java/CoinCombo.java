import static spark.Spark.*;
import java.util.HashMap;

public class CoinCombo {
  public HashMap comboOfCoins(Integer number) {
    HashMap<String, Integer> coins = new HashMap<String, Integer>();
    coins.put("quarters", 0);
    coins.put("dimes", 0);
    // coins.put("quarters", 0);
    // coins.put("quarters", 0);


    while (number >= 10) {
      if (number >=25){
        number -= 25;
        coins.put("quarters", coins.get("quarters") + 1);
      } else if (number >= 10) {
        number -= 10;
        coins.put("dimes", coins.get("dimes") + 1);
      }
    }
    return coins;
  }
}
