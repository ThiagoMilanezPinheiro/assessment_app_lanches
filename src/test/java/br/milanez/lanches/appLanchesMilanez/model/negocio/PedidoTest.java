package br.milanez.lanches.appLanchesMilanez.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

@SpringTest
public class PedidoTest {
	
	
	
	@Test
	void SolicitanteTestar() {
		Cliente pe = new Cliente("Thiago ", "1114445555 ", "thiagomilanez.gsi@gmail.com");
		
		Pedido p = new Pedido();
		p.setSolicitante(pe);
		
		System.out.println("Pedido: " + p);
		
		assertNotNull(pe);
	
	}
	
	@Test
	void SolicitanteTestarAssociacao() {
		Cliente pe = new Cliente("Thiago ", "1114445555 ", "thiagomilanez.gsi@gmail.com");
		
		Pedido p = new Pedido();
		p.setSolicitante(pe);
		
		System.out.println("Pedido: " + p);
		
		assertTrue(pe.equals(p.getSolicitante()));
	
	}
	
	
	@Test
	void SolicitanteTestarGetWeb() {
		Pedido p = new Pedido();
		assertTrue(p.isWeb());
		
	}
	
		
	@Test
	void SolicitanteTestarEetWeb() {
		Pedido p = new Pedido();
		p.setWeb(Boolean.FALSE);
		assertFalse(p.isWeb());
		
	}
		
		

}
