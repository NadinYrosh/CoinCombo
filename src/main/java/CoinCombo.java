import static spark.Spark.*;
import java.util.HashMap;

public class CoinCombo {
  public HashMap comboOfCoins(Integer number) {
    HashMap<String, Integer> coins = new HashMap<String, Integer>();
    coins.put("quarters", 0);
    coins.put("dimes", 0);
    coins.put("nikels", 0);
    coins.put("pennies", 0);


    while (number >= 1) {
      if (number >=25){
        number -= 25;
        coins.put("quarters", coins.get("quarters") + 1);
      } else if (number >= 10) {
        number -= 10;
        coins.put("dimes", coins.get("dimes") + 1);
      } else if (number >=5) {
        number -=5;
        coins.put("nikels", coins.get("nikels") +1);
      } else if (number >=1) {
        number -=1;
        coins.put("pennies", coins.get("pennies") +1);
      }
    }
    return coins;
  }
}
