package br.milanez.lanches.appLanchesMilanez.model.negocio;

public abstract class Produto {
	
	private String descricao;
	private float valor;
	private boolean produtoCaseiro; 
	
// Criação do construtor
	
	public Produto(String descricao, float valor, boolean produtoCaseiro) {
		this.descricao = descricao;
		this.valor = valor;
		this.produtoCaseiro = produtoCaseiro;
	}

	
	// Criação do ToString com o uso do StringBuilder
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValor());
		sb.append(";");
		sb.append(this.isProdutoCaseiro());
		
		return sb.toString();
	}
	
	public abstract float calcularValorVenda();
	
	public String obterValorProduto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.calcularValorVenda());
		sb.append("\r");

		return sb.toString();
	}


	public String getDescricao() {
		return descricao;
	}

	public float getValor() {
		return valor;
	}

	public boolean isProdutoCaseiro() {
		return produtoCaseiro;
	}


	
	
	

}
