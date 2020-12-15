package br.milanez.lanches.appLanchesMilanez.model.negocio;

import exceptions.PorcaoInvalidaException;

public class Pizza extends Produto {
	
	private boolean pizzas;
	private boolean esfiha;
	private int porcao;
	
	
	public Pizza(String descricao, float valor, boolean produtoCaseiro, Boolean true1) {
		super(descricao, valor, produtoCaseiro);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		StringBuilder co = new StringBuilder();
		co.append(super.toString());
		co.append(";");
		co.append(this.isEsfiha());
		co.append(";");
		co.append(this.getPorcao());
		co.append(";");
		co.append(this.isPizzas());
		
		return co.toString();
		
	}

	
	@Override
	public float calcularValorVenda() {
		float valores = this.getValor() + (this.isProdutoCaseiro() ? 2 : 0)+ (this.isPizzas() ? 2 : 0) + (this.isEsfiha() ? 4 : 0);
		float valorBorda = valores * 0.20f;
		float valorPorcao = valores * this.getPorcao();
		
		return valores + valorBorda + valorPorcao;
	}


	public boolean isEsfiha() {
		return esfiha;
	}


	public void setEsfiha(boolean esfiha) {
		this.esfiha = esfiha;
	}


	public int getPorcao() {
		return porcao;
	}


		
public void setPorcao(int porcao) throws PorcaoInvalidaException {
		
		if(porcao < 1 && porcao > 10) {
			throw new PorcaoInvalidaException("Quantidade de porção inválida.");
		}
		
		this.porcao = porcao;
	}

public boolean isPizzas() {
	return pizzas;
}

public void setPizzas(boolean pizzas) {
	this.pizzas = pizzas;
}
	

}
