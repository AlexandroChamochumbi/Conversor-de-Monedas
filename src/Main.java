package src;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws Exception {
        CurrencyService service = new CurrencyService();
        String json = service.getRate("USD", "PEN");
        double rate = ExchangeRateParser.getRate(json);
      System.out.println("Tasa USD a PEN: " + rate);
    }
}
