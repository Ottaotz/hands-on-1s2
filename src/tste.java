import Extra.Catalogo;
import Extra.GeneroE;
import audioVisual.AudioVisual;
import audioVisual.Filme;
import audioVisual.Seriado;
import lista.Lista;
import streaming.*;

import static streaming.Categoria.TOP_10;

public class tste {
    public static void main(String[] args) {
        Lista<AudioVisual> lista = new Lista<>(50);
        Lista<Catalogo> catalogoLista = new Lista<>(5);

        Streaming netflix = new Netflix();
        Streaming amazon = new AmazonPrime();
        AudioVisual f1 = new Filme("f1","5","90","euzebio",GeneroE.Acao,"120", "otto", "thomaz", "festa");
        AudioVisual f2 = new Filme("f2","4","90","euzebio",GeneroE.Acao,"120", "otto", "thomaz", "festa");
        AudioVisual f3 = new Filme("f3","3","90","euzebio",GeneroE.Acao,"120", "otto", "thomaz", "festa");
        AudioVisual f4 = new Filme("f4","2","90","euzebio",GeneroE.Acao,"120", "otto", "thomaz", "festa");


        Lista<Categoria> catn = netflix.getCategoria();
        Lista<Categoria> cata = amazon.getCategoria();


        Catalogo netcat = new Catalogo(f1, netflix, catn);
        Catalogo netcat2 = new Catalogo(f2, netflix, catn);
        Catalogo netcat3 = new Catalogo(f3, netflix, catn);
        Catalogo netcat4 = new Catalogo(f4, amazon, cata);
        catalogoLista.adiciona(netcat);
        catalogoLista.adiciona(netcat2);
        catalogoLista.adiciona(netcat3);
        catalogoLista.adiciona(netcat4);

        catalogoLista.pesquisa(3).getCategoria();



        //consegui colocar, só n consigo tirar



        //Criar os filmes e series
        //Adicionar na lista e no catalogo
        //chamar metodos do catalogo

        Jgsontst jj = new Jgsontst();

        System.out.println(jj.tste());

    }

}
