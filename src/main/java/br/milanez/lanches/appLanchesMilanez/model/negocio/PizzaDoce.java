package br.milanez.lanches.appLanchesMilanez.model.negocio;

import exceptions.AdicionalCaldaInvalidaException;

public class PizzaDoce extends Produto {
	private boolean borda;
	private float adicionalCalda;
	
	
	

	public PizzaDoce(String descricao, float valor, boolean produtoCaseiro) {
		super(descricao, valor, produtoCaseiro);
		
	}

	
	
	
	@Override
	public String toString() {
		StringBuilder pd = new StringBuilder();
		pd.append(super.toString());
		pd.append(";");
		pd.append(this.isBorda());
		pd.append(";");
		pd.append(this.getAdicionalCalda());
		
		return pd.toString();
	}
	
	@Override
	public float calcularValorVenda() {
		float valor = this.getValor() + (this.isProdutoCaseiro() ? 2 : 0);		
		float valorBorda = valor / 2;		
		float valorCalda = this.getAdicionalCalda() * 0.03f; 

		return valor + valorBorda + valorCalda;
	
	}


	public boolean isBorda() {
		return borda;
	}


	public void setBorda(boolean borda) {
		this.borda = borda;
	}


	public float getAdicionalCalda() {
		return adicionalCalda;
	}



	public void setAdicionalCalda(float adicionalCalda)throws AdicionalCaldaInvalidaException {
		
		if(adicionalCalda < 1 && adicionalCalda > 300) {
			throw new AdicionalCaldaInvalidaException("Quantidade adicional inválida.");
		}
		
		this.adicionalCalda = adicionalCalda;
	}


}
