package br.milanez.lanches.appLanchesMilanez.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import exceptions.AdicionalCaldaInvalidaException;



@SpringBootTest
public class PizzaDoceTest {

	@Test
	void PizzaDoceTestToString() throws AdicionalCaldaInvalidaException {
		PizzaDoce pizzaDoce = new PizzaDoce("Pizza de Chocolate", 10, Boolean.TRUE);
		pizzaDoce.setBorda(Boolean.FALSE);
		pizzaDoce.setAdicionalCalda(100);
		assertTrue("Pizza de Chocolate;10.0;true;false;100.0".equals(pizzaDoce.toString()));
	}
	
	@Test
	void PizzaDoceTestCalculoValorSobremesa() throws AdicionalCaldaInvalidaException {
		PizzaDoce pizzaDoce = new PizzaDoce("Pizza de Chocolate", 10, Boolean.TRUE);
		pizzaDoce.setBorda(Boolean.FALSE);
		pizzaDoce.setAdicionalCalda(100);
		assertEquals(pizzaDoce.calcularValorVenda(), 21);
	}
	
	@Test
	void PizzaDoceTestAdicionalCaldaInvalida() {
		try {
			PizzaDoce pizzaDoce = new PizzaDoce("Pizza de Chocolate", 10, Boolean.TRUE);
			pizzaDoce.setBorda(Boolean.FALSE);
			pizzaDoce.setAdicionalCalda(500);
			
		} catch (AdicionalCaldaInvalidaException e) {
			assertEquals("Quantidade adicional inválida.", e.getMessage());
		}
	}
}
