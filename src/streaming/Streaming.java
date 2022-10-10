package streaming;

import lista.Lista;

public abstract class Streaming {


    protected Lista<Categoria> categoria = new Lista<>();


    public Lista<Categoria> getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria){
        this.categoria.adiciona(categoria);
        System.out.println(this.categoria.tamanhoLista());
    }
}
