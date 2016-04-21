import static spark.Spark.*;

public class CoinCombo {
  public Integer comboOfCoins(Integer number) {
    Integer quarter = 0;
    Integer dime = 0;
    Integer nickel = 0;
    Integer penny = 0;

    while (number >= 25) {
      if (number >=25){
        number -= 25;
        quarter++;
      }
    }
    return quarter;
  }
}
