import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Jgsontst {
    private static final String SUA_CHAVE = "k_1qgy9b1d";
    private static final String TOP_250_MOVIES = "https://imdb-api.com/en/API/Top250TVs/" + SUA_CHAVE;
    private static final String TOP_250_TVS = "https://imdb-api.com/en/API/Top250TVs/"+ SUA_CHAVE;
    private static final String TOP_MOST_POPULAR_MOVIES = "https://imdb-api.com/en/API/MostPopularMovies/" + SUA_CHAVE;
    private static final String TOP_MOST_POPULAR_TVS = "https://imdb-api.com/en/API/MostPopularTVs/" + SUA_CHAVE;
    public String tste() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(TOP_250_MOVIES)).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                return response.body();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
