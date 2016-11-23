package br.com.delta.modelo;

public class EmissorEtiquetaZebra {

	public int emitirEtiqueta(Produto produto) {
		System.out.println("Código de Barras "+
	produto.getDescricao());
		return 1;
	}
	
}
