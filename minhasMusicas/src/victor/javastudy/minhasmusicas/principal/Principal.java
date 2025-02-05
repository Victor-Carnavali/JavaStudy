package victor.javastudy.minhasmusicas.principal;

import victor.javastudy.minhasmusicas.modelos.MinhasPreferidas;
import victor.javastudy.minhasmusicas.modelos.Musica;
import victor.javastudy.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Way Down We Go");
        musica1.setCantor("Kaleo");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setApresentador("Bobby Hobby");
        podcast1.setTitulo("The Bobby's life");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);
    }
}
