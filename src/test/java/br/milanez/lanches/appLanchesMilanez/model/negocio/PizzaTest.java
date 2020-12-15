package br.milanez.lanches.appLanchesMilanez.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import exceptions.MedidaNegativaException;
import exceptions.PorcaoInvalidaException;

@SpringTest
public class PizzaTest extends ProdutoTest {
	
	@Test
	void PizzaTestToString() throws MedidaNegativaException, PorcaoInvalidaException {
		Pizza piz = new Pizza("Pizza Calabresa", 20, Boolean.TRUE, Boolean.TRUE);
		piz.setEsfiha(Boolean.TRUE);
		piz.setPorcao(3);
		piz.setPizzas(Boolean.TRUE);
	

		assertTrue("Pizza Calabresa;20.0;true;true;3;true".equals(piz.toString()));
	//	System.out.println("Tipo de Pizzas: " + piz.getDescricao() + " ; " + "Com Esfiha Doce: " + piz.isEsfiha() + " ; " + "Valor total: " + piz.calcularValorVenda());

		
	}
	
	@Test
	void PizzaTestcalcularValorVenda() throws MedidaNegativaException, Exception {
		Pizza piz = new Pizza("Pizza", 15, Boolean.TRUE, Boolean.TRUE);
		piz.setEsfiha(Boolean.TRUE);
		piz.setPorcao(3);
		
	//	float valor = co.calcularValorVenda();
		
		assertEquals(piz.calcularValorVenda(), 88,2);
	//	System.out.println("Tipo de Pizzas: " + piz.getDescricao() + " ; " + "Com Esfiha Doce: " + piz.isEsfiha() + " ; " + "Valor total: " + piz.calcularValorVenda());

		
	}
	
	@Test
	void PizzaTestPorcaoInvalida() {
		try {
			Pizza piz = new Pizza("Pizza Calabresa", 15, Boolean.FALSE, Boolean.TRUE);
			piz.setEsfiha(Boolean.TRUE);
			piz.setPorcao(30);
		} catch (PorcaoInvalidaException e) {
			assertEquals("Combo inválido.", e.getMessage());
		}		
	}	
	
	

}
