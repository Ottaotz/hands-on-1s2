package streaming;

public class DisneyPlus extends Streaming{

    public DisneyPlus() {
        insereCategoria();
    }

    private void insereCategoria(){
        categoria.adiciona(Categoria.FIM_DE_SEMANA);
    }
}
