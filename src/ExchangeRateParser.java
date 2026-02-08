package src;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateParser {

    public static double getCurrencyRate(String json , String currencyCode) {
        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
        JsonObject rates = obj.getAsJsonObject("conversion_rates");
        return rates.get(currencyCode).getAsDouble();
    }
}
