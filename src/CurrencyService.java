package src;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyService {

    private static final HttpClient client = HttpClient.newHttpClient();
    private static final String apiKey = "YOUR_API_KEY_HERE"; // Reemplaza con tu clave de API

    public String getLatestRates(String base) throws Exception {
        String url = "https://v6.exchangerate-api.com/v6/"
                + apiKey + "/latest/" + base;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
