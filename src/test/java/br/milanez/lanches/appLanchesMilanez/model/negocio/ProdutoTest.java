package br.milanez.lanches.appLanchesMilanez.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTest {

	@Test
	void bebidaTest() {
		Bebida beb = new Bebida("Refri", 10, Boolean.TRUE, Boolean.FALSE);
		
		assertNotNull(beb);
	}
	
	@Test
	void pizzaTest() {
		Pizza piz = new Pizza("Pizza", 20, Boolean.FALSE, Boolean.TRUE);
		
		assertNotNull(piz);
	}
	
	@Test
	void pizzaDoceTest() {
		PizzaDoce pizdoc = new PizzaDoce("Pizza Doce", 10, Boolean.TRUE);
		
		assertNotNull(pizdoc);
	}
}
