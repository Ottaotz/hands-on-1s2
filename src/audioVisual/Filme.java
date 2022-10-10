package audioVisual;


import Extra.GeneroE;
import streaming.Streaming;

public class Filme extends AudioVisual{
    private String duracao;

    public Filme(String nome, String codigo, String ano, String diretor, GeneroE genero, String duracao, String... atores) {
        super(nome, codigo, ano, diretor, genero, atores);
        this.duracao = duracao;
    }
}
