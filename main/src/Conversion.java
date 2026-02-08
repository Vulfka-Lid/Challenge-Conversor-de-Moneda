import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {

    double resultado;

public Moneda convertirMoneda (String tipoMoneda, double monto){

    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d2c750c63e5363bdc9a6d9ed/pair/CLP/"
            + tipoMoneda +"/" + monto + "/");

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();

    HttpResponse<String> response = null;
    try {
        response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
    } catch (Exception e) {
        throw new RuntimeException("");
    }

    return new Gson().fromJson(response.body(),Moneda.class);

    resultado = monto;
    }

}
