package victor.javastudy.screenmatch.principal;

import victor.javastudy.screenmatch.modelos.Filme;
import victor.javastudy.screenmatch.modelos.Serie;
import victor.javastudy.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1972, 180);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023, 200);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2003, 200);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000, 10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Kevin James");
        buscaPorArtista.add("David Spade");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenacao por artista: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenacao por ano de lancamento: " + lista);
    }
}
