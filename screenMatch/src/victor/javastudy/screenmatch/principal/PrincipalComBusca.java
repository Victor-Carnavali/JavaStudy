package victor.javastudy.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import victor.javastudy.screenmatch.modelos.Titulo;
import victor.javastudy.screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        String busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=e119a4bd";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo ja convertido");
            System.out.println("Titulo ja convertido: " + meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Para palavras com espaco utilize '-' exemplo: top-gun | about-time");
        } catch (Exception e) {
            System.out.println("Aconteceu algo, porem nao sei o que aconteceu!");
        }
        System.out.println("O programa finalizou corretamente");

    }
}
