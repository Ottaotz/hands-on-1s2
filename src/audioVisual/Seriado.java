package audioVisual;


import Extra.GeneroE;
import streaming.Streaming;

public class Seriado extends AudioVisual{
    private int[] temporada;

    public Seriado(String nome, String codigo, String ano, String diretor, GeneroE genero, int[] temporada, String... atores) {
        super(nome, codigo, ano, diretor, genero, atores);
        this.temporada = temporada;
    }
}
