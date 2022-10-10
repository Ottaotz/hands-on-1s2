package Extra;

import audioVisual.AudioVisual;
import lista.Lista;
import streaming.Categoria;
import streaming.Streaming;

public class Catalogo {
    private AudioVisual produto;
    private Streaming streaming;
    private Lista<Categoria> categoria;

    public Catalogo(AudioVisual produto, Streaming streaming, Lista<Categoria> categoria) {
        this.produto = produto;
        this.streaming = streaming;
        this.categoria = categoria;
    }

    public void getCategoria(){
        categoria.mostraElementos();
    }
}
