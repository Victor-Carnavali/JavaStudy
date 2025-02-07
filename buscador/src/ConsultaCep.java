import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpClient.newHttpClient;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep){
        URI endereco = "https://viacep.com.br/ws/" + cep + "/json";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = HttpClient;
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Endereco.class);
    }
}
