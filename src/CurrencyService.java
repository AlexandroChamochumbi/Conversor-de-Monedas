package src;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.*;

public class CurrencyService {

    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();
    private static final String apiKey = "YOUR_API_KEY_HERE";// Reemplaza con tu clave de API

    public ExchangeRateResponse getLatestRates(String base) throws Exception {

        String url = "https://v6.exchangerate-api.com/v6/"
                + apiKey + "/latest/" + base;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return gson.fromJson(response.body(), ExchangeRateResponse.class);
    }
}
