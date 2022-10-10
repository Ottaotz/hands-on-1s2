package lista;

import Extra.Catalogo;
import streaming.Categoria;

public class Lista<T> {
	private static final int MAXIMO_TAREFAS = 10;
	private T[] lista;
	private int numeroElementos = 0;
	
	public Lista() {
		this(MAXIMO_TAREFAS);
	}

	@SuppressWarnings("unchecked")
	public Lista(int tamanhoLista) {
		lista = (T[]) new Object[tamanhoLista];
	}
	
	public boolean adiciona(int posicao, T elemento) {
		if (!ehPosicaoValida(posicao))
			return false;

		if (lista[posicao] == null)
			numeroElementos++;
		lista[posicao] = elemento;
			
		return true;
	}
	
	public boolean adiciona(T elemento) {
		if (listaCheia()) 
			return false;

		lista[numeroElementos] = elemento;
		numeroElementos++;
		return true;
	}

	private boolean ehPosicaoValida(int posicao) {
		return posicao >= 0 && posicao < lista.length;
	}
	
	public int numeroElementos() {
		return numeroElementos;
	}
	
	private boolean listaCheia() {
		return numeroElementos == lista.length;
	}
	
	public boolean existe(T elemento) {
		for (int indx = 0; indx < lista.length; indx++) {
			T t = lista[indx];
			if (t != null && t.equals(elemento))
				return true;
		}
		return false;
	}

	public T
	pesquisa(int posicao) {
		T elemento = null;
		if (ehPosicaoValida(posicao))
			elemento = lista[posicao];
			
		return elemento;
	}

	public int pesquisa(T elemento) {
		int posicao = -1; // O(1)
		for (int indx = 0; indx < lista.length; indx++) {
			T t = lista[indx]; // O(1)
			if (t != null && t.equals(elemento)) {
				posicao = indx; // O(1)
				break;
			}
		}
		
		return posicao;
	}
	
	public boolean remove(int posicao) {
		boolean removeu = false;
		if (ehPosicaoValida(posicao) && pesquisa(posicao) != null) {
			lista[posicao] = null;
			removeu = true;
			numeroElementos--;
		}
		
		return removeu;
	}

	public int tamanhoLista(){
		return numeroElementos;
	}

	public void mostraElementos(){
		if (lista.length!=0)
			for (T t : lista)
				if (t!=null)
					System.out.println(t);

	}
}
