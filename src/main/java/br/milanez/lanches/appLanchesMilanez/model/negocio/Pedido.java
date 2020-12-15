package br.milanez.lanches.appLanchesMilanez.model.negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
	
	private LocalDateTime data;
	private boolean web;
	private Cliente cliente;
	
	
	
		public Pedido() {
		this.data = LocalDateTime.now();
		this.web =  Boolean.TRUE;
		
	}
		
		
		
		
	@Override
		public String toString() {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
			return String.format("%s;%s;%s", 
					this.getData().format(formatter),
					this.web,
					this.cliente.toString()
				);
		}




	public LocalDateTime getData() {
		return data;
	}
	
	
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	public Cliente getSolicitante() {
		return cliente;
	}
	public void setSolicitante(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
