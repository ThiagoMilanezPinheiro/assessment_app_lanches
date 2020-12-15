package br.milanez.lanches.appLanchesMilanez.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import exceptions.MedidaNegativaException;

@SpringTest
public class BebidaTest {
	

	@Test
	void BebidaTestarToString() {
		Bebida b = new Bebida("Refri", 10, Boolean.TRUE, Boolean.FALSE);
		try {
			b.setMedida(200);
			b.setMarca("Coca-Cola");
			b.setAlcoolica(Boolean.FALSE);
			
			assertTrue("Refri;10.0;true;200.0;Coca-Cola;false".equals(b.toString()));
		} catch (MedidaNegativaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//System.out.println("Tipo de Bebida: " + b.getDescricao() + " ; " + "Marca da Bebida: " + b.getMarca() + " ; " + "Bebida Alcoolíca: " + b.isAlcoolica());

		
	
	}
	
	@Test
	void BebidaTestcalcularValorVenda() {
		Bebida b = new Bebida("Coca-Cola", 10, Boolean.TRUE, Boolean.FALSE);
		try {
			b.setMedida(200);
			b.setMarca("Coca-Cola");
			b.setAlcoolica(Boolean.FALSE);
			
			assertEquals(b.calcularValorVenda(), 16);
		} catch (MedidaNegativaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	
	
	@Test
	void BebidaTestMedidaNegativa() {
		Bebida be = new Bebida("Cerveja", 5, Boolean.TRUE, Boolean.TRUE);
			try {
				be.setMarca("Budweiser");
				be.setMedida(-200);
				
				fail("Problemas na validação");
			} catch (MedidaNegativaException e) {
				assertEquals("Quantidade da Medida é inválida.", e.getMessage());
			}
			
		//	System.out.println("Tipo de Bebida: " + be.getDescricao() + " ; " + "Marca da Bebida: " + be.getMarca() + " ; " + "Bebida Alcoolíca: " + be.isAlcoolica());

	}
	


}
