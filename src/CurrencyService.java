package src;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyService {

    private static final HttpClient client = HttpClient.newHttpClient();
    private static final String apiKey = "06f1dff7c47130e3cb482ee9";

    public String getRate(String from, String to) throws Exception {
        String url = "https://v6.exchangerate-api.com/v6/"
                + apiKey + "/pair/" + from + "/" + to;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
