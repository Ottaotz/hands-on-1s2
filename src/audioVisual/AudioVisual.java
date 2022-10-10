package audioVisual;

import Extra.Catalogo;

import Extra.GeneroE;
import streaming.Streaming;

public abstract class AudioVisual {
    protected String nome;
    protected String codigo;
    protected String ano;
    protected String diretor;
    protected GeneroE genero;
    protected String[] atores;

    public AudioVisual(String nome, String codigo, String ano, String diretor, GeneroE genero, String... atores) {
        this.nome = nome;
        this.codigo = codigo;
        this.ano = ano;
        this.diretor = diretor;
        this.genero = genero;
        this.atores = atores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
