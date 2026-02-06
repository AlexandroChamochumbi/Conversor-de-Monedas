package src;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateParser {

    public static double getRate(String json) {
        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
        return obj.get("conversion_rate").getAsDouble();
    }
}
