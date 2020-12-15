package br.milanez.lanches.appLanchesMilanez.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTest {
	

	
	
	@Test
	void SolicitanteTestar() {
		Cliente s = new Cliente("Thiago ", "1114445555 ", "thiagomilanez.gsi@gmail.com");
		assertNotNull(s);
	
	}
	
	@Test
	void SolicitanteTestToString() {
		Cliente s = new Cliente("Thiago", "1114445555", "thiagomilanez.gsi@gmail.com");
		assertTrue("Thiago;1114445555;thiagomilanez.gsi@gmail.com".equals(s.toString()));
	
	}
	
	
	@Test
	void SolicitanteTestGetters() {
		Cliente s = new Cliente("Thiago", "1114445555", "thiagomilanez.gsi@gmail.com");
		assertTrue("Thiago".equals(s.getNome()));
		assertTrue("1114445555".equals(s.getCpf()));
		assertTrue("thiagomilanez.gsi@gmail.com".equals(s.getEmail()));
		
	
	}
	
		
}
