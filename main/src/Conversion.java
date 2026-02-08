import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {
    public Moneda convertirMoneda(String monedaBase, String monedaDestino, double monto) {
        // Tu API Key ya está incluida en la URL
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d2c750c63e5363bdc9a6d9ed/pair/"
                + monedaBase + "/" + monedaDestino + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al conectar con la API: " + e.getMessage());
        }
    }
}