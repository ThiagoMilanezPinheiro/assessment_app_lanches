package br.milanez.lanches.appLanchesMilanez.model.negocio;

import exceptions.MedidaNegativaException;

public class Bebida extends Produto{
	

	private float medida;
	private String marca;
	private boolean alcoolica;
	
	
	public Bebida(String descricao, float valor, boolean produtoCaseiro, Boolean alcoolica) {
		super(descricao, valor, produtoCaseiro);
		this.alcoolica = alcoolica;
		// TODO Auto-generated constructor stub
	}
	
	


	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append(super.toString());
		b.append(";");
		b.append(this.getMedida());
		b.append(";");
		b.append(this.getMarca());
		b.append(";");
		b.append(this.isAlcoolica());
		
		return b.toString();
		
	}
	
	@Override
	public float calcularValorVenda() {
		
		return this.getValor() + (this.isProdutoCaseiro() ? 2 : 0) + (this.getMedida() * 0.02f) + (this.isAlcoolica() ? 4 : 0);
	}

	

	public float getMedida() {
		return medida;
	}

	public void setMedida(float medida) throws MedidaNegativaException {
		
		if(medida <= 0) {
			throw new MedidaNegativaException("Quantidade da Medida é inválida.");
		}
		
		this.medida = medida;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAlcoolica() {
		return alcoolica;
	}

	public void setAlcoolica(boolean alcoolica) {
		this.alcoolica = alcoolica;
	}

	

	

	

}
